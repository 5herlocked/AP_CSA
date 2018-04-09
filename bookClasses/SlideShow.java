/**
 * Class that represents a slide show.  A slide show has
 *  an array of pictures, a time to wait between pictures,
 *  and a title that is shown at the beginning of the show.
 * 
 * @author Barb Ericson 
 */

public class SlideShow
{

///////////fields////////////////////////////
private Picture[] pictureArray;
private int waitTime = 2000; // 2 secs



////////////constructors/////////////////////
public SlideShow()
{
  //super();  this is added for you
}
public SlideShow(Picture[] pictArray)
{
  //super();
  this.pictureArray = pictArray;
}

////////////methods/////////////////////////

/**
 * Method to get the time to wait between pictures
 * @return the time in milliseconds
 * /

public int getWaitTime()
{
  return this.waitTime;
}

/**
   * Method to change the time to wait
   * between pictures
   * @param time the new time to use
   * in milliseconds
   */

public void setWaitTime (int theWaitTime)
{
  if (theWaitTime >= 500)
  {
    this.waitTime = theWaitTime;
  }
}

public Picture getPicture(int index)
{
  if (pictureArray != null  &&
      index >= 0 &&
      index < pictureArray.length)
  {
    return this.pictureArray[index];
  }
  return null;
}

public void setPicture(Picture aPict, int index)
{
  if (pictureArray != null &&
      index >= 0 &&
      index < pictureArray.length &&
      aPict != null)
  {
    this.pictureArray[index] = aPict;
  }
}

public String toString()
{
  if (pictureArray == null)
  {
    return " A slide show with no pictures and " +
      "a wait time of " + this.waitTime;
  }
  else
  {
     return "A slide show with " + 
      this.pictureArray.length + " pictures and " +
      "a wait time of " + this.waitTime;
   }
  }  
 
public void show()  throws Exception
 { 
  // check if the array of picures isn't null
  if (this.pictureArray != null)
  {
    // loop through the pictures
    for (Picture pictObj : this.pictureArray)
    {
      pictObj.show();
      Thread.sleep(waitTime);
      pictObj.hide();
    }
  }
}
public static void main(String[] args) throws Exception
 {
   Picture[] pictArray = new Picture[5];
   pictArray[0] = new Picture(FileChooser.getMediaPath("beach.jpg"));
   pictArray[1] = new Picture(FileChooser.getMediaPath("blueShrub.jpg"));
   pictArray[2] = new Picture(FileChooser.getMediaPath("church.jpg"));
   pictArray[3] = new Picture(FileChooser.getMediaPath("eiffel.jpg"));
   pictArray[4] = new Picture(FileChooser.getMediaPath("greece.jpg"));
   SlideShow vacShow = new SlideShow(pictArray);
   System.out.println(vacShow);
   vacShow.show();
 }



} //ends the class put all methods before this!


