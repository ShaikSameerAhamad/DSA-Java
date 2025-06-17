package ToDoList;
import java.util.*;
public class ToDoListApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> tasks = new ArrayList<String>();
		while(true) {
			System.out.println("Simple To-Do-List-App");
			System.out.println("1.Add a Task");
			System.out.println("2.view Task");
			System.out.println("3.Delete a Task");
			System.out.println("4.Exit");
			System.out.println("Choose an option (1-4):");
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice == 1) {
				System.out.println("Enter your Task");
				String task = sc.nextLine();
				tasks.add(task);
				System.out.println("task is added Successfully");
				}
			if(choice == 2) {
				System.out.println("The tasks are :"+ tasks);
			}
			if(choice == 3) {
				System.out.println("Task is deleted "+tasks.remove(0));
				if(tasks.isEmpty()) {
					System.out.println("There is no tasks yet");
				}
			}
			if(choice == 4) {
				System.out.println("4.exit");
				break;
			}
			}
		sc.close();
	}
}
