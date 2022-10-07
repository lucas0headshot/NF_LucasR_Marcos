//Prova prática de PAP
//Lucas Ronchi e MArcos Antunes  3-52

public class NF { 
 public static void main(String[] args){
  loja Loja_1 = new loja(); //Loja
   Loja_1.Nome = "LARA ACESSORIOS EIRELI ME";
   Loja_1.CNPJ = "28.663.093/0001-53";
  
  compra Compra_1 = new compra(); //Compra
   Compra_1.Vl_It = 6.00f;

  System.out.println("           " + Loja_1.Nome); //Impressão da NF
  System.out.println("      AV CRISTOVÃO COLOMBO, 67 - SAVASSI");
  System.out.println("     CEP: 30140-140 - BELO HORIZONTE - MG");
  System.out.println("CNPJ:" + Loja_1.CNPJ);
  System.out.println("IE: 003.044314.0006");
  System.out.println("IM: 1.046.973/001-0");
  System.out.println("---------------------------------------------------");
  System.out.println("07/10/2022  10:55:34   CCF: 057672     COO: 061646");
  System.out.println("                  CUPOM FISCAL");
  System.out.println("ITEM CÓDIGO              DESCRIÇÃO");
  System.out.println("QTD UN. VL UNIT(R$)      ST            VL ITEM(R$)");
  System.out.println("---------------------------------------------------");
  System.out.println("001     00000000000109                   ANEL" + Compra_1.Vl_It);
  System.out.println("         1UN X " + Compra_1.Vl_It + " 02T18;00%  " + Compra_1.Vl_It);
  System.out.println("TOTAL R$                              -------------");
  System.out.println("Ct Crédito                                     " + Compra_1.Vl_It);
  System.out.println("T2=02T18;00%");
  System.out.println("MD-5:E7B70BBEC831D240FF6D8C0DDC642AC1");
  System.out.println("MINAS LEGAL: 28663093000153  10072019  600");
  System.out.println("Valor aproximado dos tributos deste cupom(Conforme");
  System.out.println("Lei Fed. 12 741/2012) R$1.42");
  System.out.println("---------------------------------------------------");
  System.out.println("CONTROLE: 02066054");
  System.out.println("---------------------------------------------------");
  System.out.println("Aplicativo: LUCASR_MARCOS - CEDUP SISTEMAS (156)");
  System.out.println("3721-5251");
  System.out.println("---------------------------------------------------");
  System.out.println("AKILOR4 OBWMGR9U BLL%GOUM AEHIH4P3 N7NDBE707FGQ");
  System.out.println("CEDUPTECH MP-4000 TH FI ECF-IF");
  System.out.println("VERSÃO: 01.00.02 ECF: 001 LJ: 0001");
  System.out.println("QQQQQQQQQEPRTUWRYW  07/10/2022 10:55:34");
  System.out.println("FAB: BE091710100011211499                        RR");
 }
}