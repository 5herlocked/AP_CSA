using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Figuring_stuff
{
    class Program
    {
        static void Main(string[] args)
        {

            IntList myIntList = new IntList(10);
            myIntList.Add(100);
            myIntList.Add(50);
            myIntList.Add(200);
            myIntList.Add(25);
            Console.WriteLine(myIntList);

            SortedIntList myList = new SortedIntList(10);
            myList.Add(100);
            myList.Add(50);
            myList.Add(200);
            myList.Add(25);
            Console.WriteLine(myList);

            Console.ReadLine();
        }
    }
}
