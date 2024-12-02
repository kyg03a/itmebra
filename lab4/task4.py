import re

def yaml_to_xml(yaml_file, xml_file):
    with open(yaml_file, 'r', encoding='utf-8') as f:
        lines = f.readlines()

    grammar = {
        'day': re.compile(r'- day:'),
        'name': re.compile(r'name: (.+)'),
        'class': re.compile(r'- class:'),
        'key_value': re.compile(r'(\w+): (.+)')
    }

    xml_content = ['<schedule>\n']
    current_day = False
    in_class = False

    for line in lines:
        line = line.strip()

        if grammar['day'].match(line):
            if current_day:
                xml_content.append('    </classes>\n')
                xml_content.append('  </day>\n')
            current_day = True
            in_class = False

        elif grammar['name'].match(line):
            day_name = grammar['name'].match(line).group(1)
            xml_content.append(f'  <day name="{day_name}">\n')
            xml_content.append('    <classes>\n')

        elif grammar['class'].match(line):
            if in_class:
                xml_content.append('      </class>\n')
            xml_content.append('      <class>\n')
            in_class = True

        elif grammar['key_value'].match(line):
            key, value = grammar['key_value'].match(line).groups()
            xml_content.append(f'        <{key}>{value}</{key}>\n')

    if current_day:
        if in_class:
            xml_content.append('      </class>\n')
        xml_content.append('    </classes>\n')
        xml_content.append('  </day>\n')

    xml_content.append('</schedule>')

    with open(xml_file, 'w', encoding='utf-8') as f:
        f.writelines(xml_content)

yaml_to_xml('schedule.yaml', 'task4_rez.xml')

