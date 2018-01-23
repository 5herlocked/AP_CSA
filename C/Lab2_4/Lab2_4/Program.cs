using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab2_4
{
    class Program
    {
        private static  Double conversion_rate = 9/5;
        private static int convert_C_F = 32;
        private static Double convert_K_C = 273.15;
        private static Double tempOut = 0;

        private static void Convert(Double tempIn, String inUnit, String outUnit)
        {
            if (inUnit.Equals(outUnit))
            {
                tempOut = tempIn;
            }
            else if (inUnit.Equals("C") && outUnit.Equals("F"))
            {
                tempOut = (tempIn * conversion_rate) + convert_C_F;
            }
            else if (inUnit.Equals("C") && outUnit.Equals("K"))
            {
                tempOut = (tempIn + convert_K_C);
            }
            else if (inUnit.Equals("F") && outUnit.Equals("C"))
            {
                tempOut = (tempIn - convert_C_F) * (1 / conversion_rate);
            }
            else if (inUnit.Equals("F") && outUnit.Equals("K"))
            {
                tempOut = ((tempIn - convert_C_F) * (1 / conversion_rate)) + convert_K_C;
            }
            else if (inUnit.Equals("K") && outUnit.Equals("C"))
            {
                tempOut = tempIn - convert_K_C;
            }
            else if (inUnit.Equals("K") && outUnit.Equals("F"))
            {
                tempOut = ((tempIn - convert_K_C) * conversion_rate) + convert_C_F;
            }
        }
        
        static void Main(string[] args) {

            Console.WriteLine("TEMPRATURE CONVERTER");

            Console.WriteLine("Choose the start unit of Temprature (C/F/K): ");
            String tempratureUnit = Console.ReadLine().ToUpper();

            Console.WriteLine("Choose the Final Unit of Temprature (C/F/K): ");
            String outputUnit = Console.ReadLine().ToUpper();

            Console.WriteLine("Type Temprature Input: ");
            Double inTemp = Double.Parse(Console.ReadLine());

            Convert(inTemp, tempratureUnit, outputUnit);

            Console.WriteLine("You converted {0} {1} to {2} {3}", inTemp, tempratureUnit, tempOut, outputUnit);
            Console.ReadLine();
        }
    }
}