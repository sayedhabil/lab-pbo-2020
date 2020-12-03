import java.util.ArrayList;

public class Bus{
    private ArrayList<Penumpang> penumpangBiasa;
    private ArrayList<Penumpang> penumpangPrioritas;
    
    public Bus(){
        this.penumpangBiasa = new ArrayList<Penumpang>();
        this.penumpangPrioritas = new ArrayList<Penumpang>();
    }
    
    public ArrayList<Penumpang> getPenumpangBiasa(){
        return this.penumpangBiasa;
    }

    public ArrayList<Penumpang> getPenumpangPrioritas(){
        return this.penumpangPrioritas;
    }
    
    public int getJumlahPenumpangBiasa(){
        return this.penumpangBiasa.size();
    }

    public int getJumlahPenumpangPrioritas(){
        return this.penumpangPrioritas.size();
    }

    public boolean NaikPenumpang(Penumpang penumpang){
        if(penumpang.getHamil()==true || penumpang.getUmur()<10 || penumpang.getUmur()>60){
            if(getJumlahPenumpangPrioritas()<2){
                this.penumpangPrioritas.add(penumpang);
                return true;
            }
        }else if(penumpangPrioritas.size()== 2 && penumpangBiasa.size()<= 4){
            this.penumpangBiasa.add(penumpang);
            return true;
        } 

        if(getJumlahPenumpangBiasa()<4){
            this.penumpangBiasa.add(penumpang);
            return true;
        }

        return false;
    }

    public boolean turunkanPenumpang(String nama){
        ArrayList<Penumpang> penumpangB = getPenumpangBiasa();
        for(Penumpang pb : penumpangB){
            String temp = pb.getNama();
            if(temp.equalsIgnoreCase(nama)){
                this.penumpangBiasa.remove(pb);
                return true;
            }
        }

        ArrayList<Penumpang> penumpangP = getPenumpangPrioritas();
        for(Penumpang pp : penumpangP){
            String temp = pp.getNama();
            if(temp.equalsIgnoreCase(nama)){
                this.penumpangPrioritas.remove(pp);
                return true;
            }
        }

        return false;
    }

    public String toString(){
        int i=0;
        String temp = "Penumpang Biasa = ";
        ArrayList<Penumpang> penumpangB = getPenumpangBiasa();
        for(Penumpang pb : penumpangB){
            if(i!=0){
                temp += ", ";
            }
            temp += pb.getNama();
            i += 1;
        }
        if(i==0){
            temp += "<Kosong>";
        }
        temp += "\nPenumpang Prioritas = ";
        i = 0;

        ArrayList<Penumpang> penumpangP = getPenumpangPrioritas();
        for(Penumpang pp : penumpangP){
            if(i!=0){
                temp += ", ";
            }
            temp += pp.getNama();
            i += 1;
        }
        if(i==0){
            temp += "<Kosong>";
        }
        temp += "\nJumlah Penumpang = "+Integer.toString(getJumlahPenumpangBiasa() + getJumlahPenumpangPrioritas());
        
        return temp;
    }
}