public class Student implements Comparable
{
    private String name;
    private int marks;
      
    public Student(String nm, int mk)
    {
        this.name = nm;
        this.marks = mk;
    }
    
    public int getMarks()
    {
        return marks;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int compareTo(Object obj)
    {
        return 0;
    }
    
    public String toString() 
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Name: "+ name +"\n");
        buffer.append("Marks: " + marks + "\n");
        return buffer.toString();
    }
  
}
