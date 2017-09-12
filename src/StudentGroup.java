import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	public Student[] students;
	public int lengt,i,j,k;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */

	public StudentGroup(int length) {
	lengt=length;
		this.students = new Student[length];
	}

	public void length(int l)
{
if(l<0 || l>length)
throw IllegalArgumentException;
}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
for(i=1;i<=lengt;i++)
{
this.students[i].setId(students[i].getId);
this.students[i].setFullName(students[i].getFullName);
	this.students[i].setBirthDate(students[i].getBirthDate);
	this.students[i].avgMarks(students[i].getAvgMarks);
}	
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
	return students[i];
		
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	if(index==null) throw IllegalArgumentException;
	if(index<0 || index>length) length(index);
	students[index].setId(student.getId);
	students[index].setFullName(student.getFullName);
	students[index].setBirthDate(student.getBirthDate);
	students[index].setAvgMarks(student.getAvgMarks);
	}

	@Override
	public void addFirst(Student student) {
	if(index==null) throw IllegalArgumentException;
StudentGroup(++lengt);
	for(i=lengt;i>0;i--)
{
	students[i+1].setId(students[i].getId);
	students[i+1].setFullName(students[i].getFullName);
	students[i+1].setBirthDate(students[i].getBirthDate);
	students[i+1].setAvgMarks(students[i].getAvgMarks);
}
	students[1].setId(student.getId);
	students[1].setFullName(student.getFullName);
	students[1].setBirthDate(student.getBirthDate);
	students[1].setAvgMarks(student.getAvgMarks);

	
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
if(index==null) throw IllegalArgumentException;
	StudentGroup(++lengt);
	students[lengt].setId(student.getId);
	students[lengt].setFullName(student.getFullName);
	students[lengt].setBirthDate(student.getBirthDate);
	students[lengt].setAvgMarks(student.getAvgMarks);

	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
if(index==null) throw IllegalArgumentException;
	if(index<0 || index>lengt) length(index);
len(++lengt);
	for(i=lengt;i>index;i--)
{
	students[i+1].setId(students[i].gdtId);
	students[i+1].setFullName(students[i].getFullName);
	students[i+1].setBirthDate(students[i].getBirthDate);
	students[i+1].setAvgMarks(students[i].getAvgMarks);
}	
students[index].id=student.id;
	students[index].setFullName(student.getFullName);
	students[index].setBirthDate(student.getBirthDate);
	students[index].setAvgMarks(student.getAvgMarks);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
if(index==null) throw IllegalArgumentException;
	if(index<0 || index>length) length(index);
	for(i=index;i<=lengt;i++)
	students[i].setId(students[i+1].getId);
	students[i].setFullName(student[i+1].getFullName);
	students[i].setBirthDate(student[i+1].getBirthDate);
	students[i].setAvgNarks(student[i+1].getAvgMarks);
StudentGroup(--lengt);	
	

	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	if(student==null) throw IllegalArgumentException;lenght(index);
	for(i=1;i<=lengt;i++)
	{
if(students[i].getId=student[i].getId)
{
students[i].setId(student[i].getId);
students[i].setFullName(student[i].getFullName);
	students[i].setBirthDate(student[i].getBirthDate);
	students[i].avgMarks(student[i].getAvgMarks);

}
else
{
System.out.println("Student not exist");
thorw IllegalArgumentException;
}
}
StudentGroup(--lengt);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
if(index==null) throw IllegalArgumentException;
length(index);
	for(i=index+1;i<=length;i++)
	{
	students[i].setId(0);
	students[i].setFullName(null);
	students[i].setBirthDate(null);
	students[i].setAvgMarks(0);	
	}
	StudentGroup(index);
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	if(student==null) throw IllegalArgumentException;
	length(index);
	for(i=1;i<=lengt;i++)
	{
if(students[i].getId==student[i].getId)
{k=i;
for(j=i+1;i<=length;i++)
	{
	students[j].setId(0);
	students[j].setFullName(null);
	students[j].setBirthDate(null);
	students[j].setAvgMarks(0);	
	}

}
}
StudentGroup(k);

	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
if(student==null) throw IllegalArgumentException;length(index);
	for(i=1;i<index;i++)
{
	students[i].setId(0);
	students[i].setFullName(null);
	students[i].setBirthDate(null);
	students[i].setAvgMarks(0);	
	}
lengt=lengt-index;
StudentGroup(lengt);
	
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
if(student==null) throw IllegalArgumentException;
	for(i=1;i<index;i++)
	{
if(students[i].getId==student[i].getId)
{
k=i;
for(j=0;j<=i;j++)
	{
	students[j].setId(0);
	students[j].setFullName(null);
	students[j].setBirthDate(null);
	students[j].setAvgMarks(0);	
	}
}

}

lengt=lengt-k;
StudentGroup(lengt);
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
