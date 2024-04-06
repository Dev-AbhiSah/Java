import os

# Define the directory path
directory_path = "./"

# List all files in the directory
files = os.listdir(directory_path)

# Filter files with .class extension
class_files = [file for file in files if file.endswith(".class")]

# Remove each .class file
for class_file in class_files:
    file_path = os.path.join(directory_path, class_file)
    os.remove(file_path)
    print(f"Removed {class_file}")

print("All .class files have been removed from the directory.")
