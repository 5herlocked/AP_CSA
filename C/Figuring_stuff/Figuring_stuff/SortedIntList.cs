using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Figuring_stuff
{
    public class SortedIntList : IntList
    {
        public SortedIntList() : base() { }

        public SortedIntList(int size)
        {
            IntList list = new IntList(size);
        }


        public override void Add(int value)
        {
            list[numElements] = value;

            for (int i = 0; i < list.Length; i++)
            { //my sort
                int temp;
                //sort ascending or descending (just change the if statement)
                for (int c = 0; c < list.Length; c++)
                {
                    if (list[i] < list[c])
                    {
                        temp = list[i];
                        list[i] = list[c];
                        list[c] = temp;
                    }
                }
            }
        }
    }
}
