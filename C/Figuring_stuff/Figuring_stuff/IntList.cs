using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Figuring_stuff
{
    public class IntList
    {
        protected int[] list;
        protected int numElements = 0;

        public IntList() { list = new int[10]; }

        //constructor
        public IntList(int size)
        {
            list = new int[size];
        }

        public virtual void Add(int value)
        {
            if (numElements == list.Length)
                Console.WriteLine("Can't add, list is full");
            else
            {
                list[numElements] = value;
                numElements++;
            }

        }

        public override String ToString()
        {
            StringBuilder stringBuilder = new StringBuilder("");
            for (int i = 0; i < numElements; i++)
            {
                stringBuilder.Append(i + ": " + list[i] + "\n");
            }

            return stringBuilder.ToString();
        }
    }
}
