public class calendrier {
private byte date;
short annee;
private Jour jour;
private Mois mois;
enum Jour{
LUNDI,MARDI,MERCREDI,JEUDI,VENDREDI,SAMEDI,DIMANCHE}
enum Mois{
JANVIER,FEVRIER,MARS,AVRIL,MAI,JUIN,JUILLET,AOUT,SEPTEMBRE,OCTOBRE,NOVEMBRE,DECEMBRE}
public calendrier(byte date,short annee,Jour jour,Mois mois){
this.date=date;
this.annee=annee;
this.jour=jour;
this.mois=mois;
}
@Override
public string toString(){
return "Nous somme"+jour+"le"+date+"/"+mois+"/"+annee;
}
}
