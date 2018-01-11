// ****************************************************************
// IntList.java
//
// An (unsorted) integer list class with a method to add an 
// integer to the list and a toString method that returns the contents
// of the list with indices.
//          
// ****************************************************************
public class IntList
{

    protected int[] list;
    protected int numElements = 0;
    
    //------------------------------------------------------------- 
    // Constructor -- creates an integer list of a given size.
    //------------------------------------------------------------- 
    public IntList(int size)
    {
        list = new int[size];
    }
    
    //------------------------------------------------------------- 
    // Adds an integer to the list.  If the list is full,
    // prints a message and does nothing.
    //------------------------------------------------------------- 
    public void add(int value)
    {
        if (numElements == list.length) {
            int[] temp = new int[list.length + 6];
            for (int i = 0; i < list.length; i++)
                temp[i] = list[i];
            list = temp;
            list[numElements] = value;
            numElements++;
        }
        else
        {
            list[numElements] = value;
            numElements++;
        }
    }
    
    //------------------------------------------------------------- 
    // Returns a string containing the elements of the list with their
    // indices.
    //------------------------------------------------------------- 
    public String toString()
    {
        String returnString = "";
        for (int i=0; i<numElements; i++)
            returnString += i + ": " + list[i] + "\n";
        return returnString;
    }
}