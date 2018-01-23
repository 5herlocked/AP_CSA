using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab2_3
{
    class Program
    {
        private static double sum;
        private static double product;
        private static double difference;
        private static double quotient;
        private static double remainder;

        private static void Calculate (double num1, double num2)
        {
            sum = num1 + num2;
            product = num1 * num2;
            difference = num2 - num1;
            quotient = num2 / num1;
            remainder = num2 % num1;
        }
        static void Main(string[] args)
        {
            Console.WriteLine("Enter one decimal: ");
            double num1 = Double.Parse(Console.ReadLine());

            Console.WriteLine("Enter one more decimal: ");
            double num2 = Double.Parse(Console.ReadLine());

            Console.WriteLine("You have selected {0}, {1}", num1, num2);

            Calculate(num1, num2);

            Console.WriteLine("The Sum is : {0} \n" +
                                "The Difference is: {1} \n" +
                                "The product is: {2} \n" +
                                "The Quotient is: {3} \n" +
                                "The Remainder is: {4}", sum, difference, product, quotient, remainder);
            Console.ReadLine();
        }
    }
}
