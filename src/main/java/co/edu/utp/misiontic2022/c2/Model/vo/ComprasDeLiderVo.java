package co.edu.utp.misiontic2022.c2.Model.vo;
// Consulta de los 10 lideres con menores compras
public class ComprasDeLiderVo {
    private String lider;
    private Double valor;
    
    public String getLider() {
        return lider;
    }
    public void setLider(String lider) {
        this.lider = lider;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "ComprasDeLiderVo [lider=" + lider + ", valor=" + valor + "]";
    }
}
