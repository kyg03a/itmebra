import yaml
import xml.etree.ElementTree as ET
from xml.dom import minidom

def yaml_to_xml(yaml_file, xml_file):
    
    with open(yaml_file, 'r', encoding='utf-8') as f:
        schedule = yaml.safe_load(f)

    schedule_element = ET.Element('schedule')

    
    for day in schedule['schedule']:
        day_element = ET.SubElement(schedule_element, 'day', name=day['day']['name'])
        classes_element = ET.SubElement(day_element, 'classes')

        
        for class_info in day['day']['classes']:
            class_element = ET.SubElement(classes_element, 'class')
            for key, value in class_info['class'].items():
                ET.SubElement(class_element, key).text = str(value)
    

    xml_str = ET.tostring(schedule_element, encoding='utf-8', xml_declaration=True).decode('utf-8')

    pretty_xml_str = minidom.parseString(xml_str).toprettyxml(indent="  ")

    with open(xml_file, 'w', encoding='utf-8') as f:
        f.write(pretty_xml_str)

yaml_to_xml('schedule.yaml', 'task2_rez.xml')
