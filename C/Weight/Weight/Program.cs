using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Weight
{
    class Program
    {
        private static Double CalculateMen (List<String> height = null)
        {
            
        }

        private static Double CalculateWamen (List<String> height = null)
        {

        } 
        static void Main(string[] args)
        {
            Console.WriteLine("This program finds the ideal weight for your height.");

            Console.WriteLine("Please enter your sex(M/F): ");
            String sex = Console.ReadLine();
            sex = sex.ToLower();

            Console.WriteLine("Please enter your height in feet anad inches (feet, inches): ");
            String inHeight = Console.ReadLine();

            Console.WriteLine("Please enter your weight: ");
            Double inWeight = Double.Parse(Console.ReadLine());

            List<String> height = new List<String>(inHeight.Split(','));
            Double idealWeight = 0;

            if (sex.Equals("m"))
            {
                idealWeight = CalculateMen(height);
            }
            else if (sex.Equals("f"))
            {
                idealWeight = CalculateWamen(height);
            }

            if (inWeight <= (idealWeight * 0.15) -idealWeight && inWeight >= (idealWeight * 0.15) + idealWeight)
            {

            }
        }
    }
}
