import re

def yaml_to_xml(yaml_file, xml_file):
    with open(yaml_file, 'r', encoding='utf-8') as f:
        lines = f.readlines()
        lines = [line for line in lines if not line.strip().startswith('classes:')]

    xml_content = ['<schedule>\n']
    current_day = False
    inside_class = False

    day_pattern = re.compile(r'^\s*-\s*day:\s*(.*)$')
    name_pattern = re.compile(r'^\s*name:\s*(.*)$')
    class_pattern = re.compile(r'^\s*-\s*class:\s*(.*)$')
    key_value_pattern = re.compile(r'^(.+?):\s*(.*)$')

    for line in lines[1:]:
        line = line.strip()

        if day_pattern.match(line):
            if current_day:
                xml_content.append('    </classes>\n')
                xml_content.append('  </day>\n')
            current_day = True
            inside_class = False

        elif name_pattern.match(line):
            day_name = name_pattern.match(line).group(1).strip()
            xml_content.append(f'  <day name="{day_name}">\n')
            xml_content.append('    <classes>\n')

        elif class_pattern.match(line):
            if inside_class:
                xml_content.append('      </class>\n')
            xml_content.append('      <class>\n')
            inside_class = True

        elif key_value_pattern.match(line):
            key, value = key_value_pattern.match(line).groups()
            key = key.strip()
            value = value.strip()
            xml_content.append(f'        <{key}>{value}</{key}>\n')

    if current_day:
        if inside_class:
            xml_content.append('      </class>\n')
        xml_content.append('    </classes>\n')
        xml_content.append('  </day>\n')

    xml_content.append('</schedule>')

    with open(xml_file, 'w', encoding='utf-8') as f:
        f.writelines(xml_content)

yaml_to_xml('schedule.yaml', 'task3_rez.xml')
