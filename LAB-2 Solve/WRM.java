public class WRM {
  Patient dh;
  public WRM() {
    dh = new Patient(null, null, null, null, null, null);
    dh.next = dh;
    dh.prev = dh;
  }
  
  public void registerPatient(int id, String name, int age, String bloodgroup) {
    Patient new_pat = new Patient(id, name, age, bloodgroup, this.dh, this.dh.prev);
    Patient last = this.dh.prev;
    last.next = new_pat;
    new_pat.prev = last;
    new_pat.next = this.dh;
    this.dh.prev = new_pat;
    System.out.println("Patient " + name + " registered successfully.");
  }
  public void servePatient() {
    if (this.dh.next == this.dh) {
      System.out.println("No patients to serve.");
      return;
    }
    Patient first_pat = this.dh.next;
    System.out.println("Serving patient: " + first_pat.name);
    this.dh.next = first_pat.next;
    first_pat.next.prev = this.dh;
  }
  public void showAllPatient() {
    if (this.dh.next == this.dh) {
      System.out.println("No patients in waiting");
      return;
    }
    
    Patient temp = this.dh.next;
    System.out.println("waiting patients");
    while (!Objects.equals(temp, this.dh)) {
      System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Age: " + temp.age + ", Blood Group: " + temp.bloodGroup);
      temp = temp.next;
    }
  }
  public boolean canDoctorGoHome() {
    if (this.dh.next == this.dh) {
      System.out.println("YES, doctor can go home.");
    } else {
      System.out.println("NO, doctor can't go home.");
    }
  }
  
  public void cancelAll() {
    this.dh.next = this.dh;
    this.dh.prev = this.dh;
    System.out.println("All appointments have been cancelled");
  }
  
  
  public void reverseTheLine() {
    if (this.dh.next == this.dh) {
      return;
    }
    
    Patient new_head = this.dh.next;
    Patient new_tail = this.dh.next;
    Patient k = this.dh.next.next;
    
    while (!Objects.equals(k, this.dh)) {
      Patient temp = k.next;
      k.next = new_head;
      new_head.prev = k;
      new_head = k;
      k = temp;
    }
    System.out.println("Successfully reversed the line.");
    
    new_head.prev = this.dh;
    new_tail.next = this.dh;
    this.dh.next = new_head;
    this.dh.prev = new_tail;
  }
}
