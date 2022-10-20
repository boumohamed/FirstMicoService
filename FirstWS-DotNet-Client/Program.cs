using System;
using proxy;


namespace FirstWS_DotNet_Client
{
    class Program
    {
        static void Main(string[] args)
        {
            BanqueService stub = new BanqueServiceClient();
            convertRequest code1 = new convertRequest(5);
            convertResponse res1 = stub.convert(code1);
            Console.WriteLine(res1.@return);
            getCompteRequest code2 = new getCompteRequest(2);
            getCompteResponse res2 = stub.getCompte(code2);
            compte cpt = res2.@return;
            Console.WriteLine("----------------------");
            Console.WriteLine("Compte : " + cpt.code + " => " + cpt.solde + " Mad");
            Console.WriteLine("---------  Comptes -------------");
            getComptesResponse res3 = stub.getComptes(new getComptesRequest());
            compte[] list = res3.@return;
            foreach (compte c in list)
            {
                Console.WriteLine("Compte : " + c.code + " => " + c.solde + " Mad");
            }





        }
    }
}
