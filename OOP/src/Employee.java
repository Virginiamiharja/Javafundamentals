public class Employee {
    private int salary;
    private int overtime;
    private int payPerHour;

    // Biar bisa dipanggil secara langsung tanpa buat instance
    // Dia gabisa dipanggil dalam kelas sendiri gitu
    public static int employeeCount;

    public Employee(int salary, int payPerHour) {
        setSalary(salary);
        setPayPerHour(payPerHour);
        employeeCount++;
    }

    // Ini overloading constructor
    public Employee(int salary) {
        // setSalary(salary);
        // setPayPerHour(0);
        // employeeCount++;
        
        // Bisa pake begini untuk manggil employee yang diatas
        this(salary,0);
    }

    // Kenapa si employee count bisa kebaca ? karena mereka sama2 static
    public static int printEmployeeCount() {
        return employeeCount;
    }

    // Encapsulation
    // Abstraction -> Hal2 yang gaperlu dilihat oleh user

  private void setSalary(int salary) {
    if (salary <= 0) {
      throw new IllegalArgumentException("Salary cannot be below 0");
    }

    this.salary = salary;
  };

  public int getSalary() {
    return this.salary;
  }

  private void setOvertime(int overtime) {
    if (overtime < 0) {
      throw new IllegalArgumentException("Overtime cannot be below 0");
    }

    this.overtime = overtime;
  }

  public int getOvertime() {
    return this.overtime;
  }

  private void setPayPerHour(int payPerHour) {
    if (payPerHour <= 0) {
      throw new IllegalArgumentException("Pay per our cannot be below 0");
    }

    this.payPerHour = payPerHour;
  }

  public int getPayPerHour() {
    return payPerHour;
  }

  public int calculateWage(int overtime) {
    setOvertime(overtime);
    return this.salary + (this.overtime * this.payPerHour);
  }

  public int calculateWage() {
    return calculateWage(0);
  }
}