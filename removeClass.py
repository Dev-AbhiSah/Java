import os

folder_path = "./"  # Replace with the actual folder path
files = os.listdir(folder_path)

for file in files:
    if file.endswith(".class"):
        file_path = os.path.join(folder_path, file)
        os.remove(file_path)
