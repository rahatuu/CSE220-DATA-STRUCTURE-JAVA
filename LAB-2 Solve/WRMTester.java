public class WRMTester {
  public static void main(String[] args) {
    System.out.println("** Welcome to Waiting Room Management System **");
    
    WRM w = new WRM();
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      System.out.println("=Options=");
      System.out.println("1. registerPatient()");
      System.out.println("2. servePatient()");
      System.out.println("3. showAllPatient()");
      System.out.println("4. canDoctorGoHome()");
      System.out.println("5. cancelAll()");
      System.out.println("6. ReverseTheLine()");
      System.out.println("7. exit");
      System.out.println("==================");
      
      System.out.print("Enter your selection: ");
      String select = scanner.nextLine();
      
      if (select.equals("1")) {
        System.out.print("Enter Patient ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Patient Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Patient Blood Group: ");
        String bloodgroup = scanner.nextLine();
        w.registerPatient(id, name, age, bloodgroup);
      } else if (select.equals("2")) {
        w.servePatient();
      } else if (select.equals("3")) {
        w.showAllPatient();
      } else if (select.equals("4")) {
        w.canDoctorGoHome();
      } else if (select.equals("5")) {
        w.cancelAll();
      } else if (select.equals("6")) {
        w.reverseTheLine();
      } else if (select.equals("7")) {
        System.out.println("Exiting the system. Goodbye!");
        break;
      } else {
        System.out.println("Invalid selection");
      }
    }
  }
}

