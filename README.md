    import java.util.ArrayList; // Mengimpor kelas ArrayList untuk menyimpan daftar tugas.
    import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input dari pengguna.

    public class AndreanRezza_todolist { // Mendeklarasikan kelas utama AndreanRezza_todolist.
    private ArrayList<String> todoList; // Mendeklarasikan ArrayList untuk menyimpan daftar tugas.

    public AndreanRezza_todolist() { // Konstruktor untuk menginisialisasi daftar tugas.
        todoList = new ArrayList<>();
    }

    public void addTask(String task) { // Metode untuk menambahkan tugas ke daftar.
        todoList.add(task);
        System.out.println("Task added successfully!"); // Menampilkan pesan sukses.
    }

    public void removeTask(String task) { // Metode untuk menghapus tugas berdasarkan nama.
        if (todoList.remove(task)) { // Jika tugas ditemukan dan dihapus, tampilkan pesan sukses.
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Task not found!"); // Jika tugas tidak ditemukan, tampilkan pesan gagal.
        }
    }

    public void removeTaskByIndex(int index) { // Metode untuk menghapus tugas berdasarkan indeks.
        if (index >= 0 && index < todoList.size()) { // Memeriksa apakah indeks valid.
            todoList.remove(index);
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Invalid index!"); // Menampilkan pesan jika indeks tidak valid.
        }
    }

    public void searchTask(String task) { // Metode untuk mencari tugas berdasarkan nama.
        if (todoList.contains(task)) { // Jika tugas ditemukan, tampilkan pesan bahwa tugas ditemukan.
            System.out.println("Task found: " + task);
        } else {
            System.out.println("Task not found!"); // Jika tidak ditemukan, tampilkan pesan tidak ditemukan.
        }
    }

    public void displayTasks() { // Metode untuk menampilkan semua tugas dalam daftar.
        if (todoList.isEmpty()) { // Jika daftar kosong, tampilkan pesan bahwa tidak ada tugas.
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("To-Do List:"); // Menampilkan semua tugas dalam daftar.
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i)); // Menampilkan daftar tugas dengan nomor indeks.
            }
        }
    }

    public static void main(String[] args) { // Metode utama untuk menjalankan program.
        AndreanRezza_todolist app = new AndreanRezza_todolist(); // Membuat objek aplikasi.
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna.
        boolean running = true; // Variabel untuk mengontrol loop aplikasi.

        while (running) { // Loop utama aplikasi.
            System.out.println("\nTo-Do List Application"); // Menampilkan menu utama.
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task By Task Name");
            System.out.println("3. Remove Task By Index");
            System.out.println("4. Search Task By Task Name");
            System.out.println("5. Display Tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt(); // Membaca pilihan pengguna.
            scanner.nextLine(); // Membersihkan buffer input.

            switch (choice) { // Switch case untuk menangani pilihan pengguna.
                case 1:
                    System.out.print("Enter task to add: ");
                    String taskToAdd = scanner.nextLine(); // Membaca tugas dari input pengguna.
                    app.addTask(taskToAdd); // Memanggil metode addTask().
                    break;

                case 2:
                    System.out.print("Enter task to remove: ");
                    String taskToRemove = scanner.nextLine(); // Membaca tugas yang akan dihapus.
                    app.removeTask(taskToRemove); // Memanggil metode removeTask().
                    break;

                case 3:
                    System.out.print("Enter index to remove: ");
                    int indexToRemove = scanner.nextInt(); // Membaca indeks yang akan dihapus.
                    app.removeTaskByIndex(indexToRemove - 1); // Memanggil metode removeTaskByIndex().
                    break;

                case 4:
                    System.out.print("Enter task to search: ");
                    String taskToSearch = scanner.nextLine(); // Membaca tugas yang akan dicari.
                    app.searchTask(taskToSearch); // Memanggil metode searchTask().
                    break;

                case 5:
                    app.displayTasks(); // Memanggil metode displayTasks() untuk menampilkan daftar tugas.
                    break;

                case 6:
                    running = false; // Menghentikan loop aplikasi.
                    System.out.println("Exiting the application..."); // Menampilkan pesan keluar.
                    break;

                default:
                    System.out.println("Invalid choice. Please try again."); // Menampilkan pesan jika pilihan tidak valid.
            }
        }

        scanner.close(); // Menutup scanner setelah aplikasi selesai.
    }
}