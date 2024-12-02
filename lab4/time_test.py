import time

tasks = ['task1', 'task2', 'task3', 'task4']
task_times = {}

for task in tasks:
    start_time = time.perf_counter()
    for _ in range(100):
        __import__(task)
    end_time = time.perf_counter()
    task_times[task] = end_time - start_time

print(f"Основное задание - {task_times['task1']}")
print(f"Доп задание 1 - {task_times['task2']}")
print(f"Доп задание 2 - {task_times['task3']}")
print(f"Доп задание 3 - {task_times['task4']}")


