import csv

def yaml_to_csv(yaml_file, csv_file):
    with open(yaml_file, 'r', encoding='utf-8') as f:
        lines = f.readlines()

    csv_content = []
    current_day = None
    current_class = None
    all_keys = set()

    for line in lines:
        line = line.strip()

        if line.startswith('- day:'):
            if current_day:
                if current_class:
                    csv_content.append(current_class)  
                    current_class = None
            current_day = None

        elif line.startswith('name:'):
            day_name = line.split(':', 1)[1].strip()
            current_day = day_name

        elif line.startswith('- class:'):
            if current_class:
                csv_content.append(current_class)  
            current_class = {'day': current_day}

        elif ':' in line and not line.startswith('classes:'):
            key, value = line.split(':', 1)
            key = key.strip()
            value = value.strip()
            if current_class is not None:
                current_class[key] = value
                all_keys.add(key)

    if current_class:
        csv_content.append(current_class)  

    
    fieldnames = ['day'] + list(all_keys - {'classes'})

    with open(csv_file, 'w', newline='', encoding='utf-8-sig') as f:
        writer = csv.DictWriter(f, fieldnames=fieldnames)
        writer.writeheader()
        writer.writerows(csv_content)


yaml_to_csv('schedule.yaml', 'task51_rez.csv')
