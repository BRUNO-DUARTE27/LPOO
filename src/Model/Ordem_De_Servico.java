package Model;

public class Ordem_De_Servico {
	
	private int id;
	private String status;
	private int id_Funcionario;
	private int id_Cliente;
	
	private float valorTotal;
	private float valorPecas;
	private int  cargaHoraria;
	public int getId_Funcionario() {
		return id_Funcionario;
	}
	public void setId_Funcionario(int id_Funcionario) {
		this.id_Funcionario = id_Funcionario;
	}
	public int getId_Cliente() {
		return id_Cliente;
	}
	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}
	public float getCustoHH() {
		return custoHH;
	}
	public void setCustoHH(float custoHH) {
		this.custoHH = custoHH;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	private float custoHH;
	private String Observacao;
	
	public Ordem_De_Servico(int id_Funcionario, int id_Cliente,String observacao) {
		
		this.id_Funcionario = id_Funcionario;
		this.id_Cliente = id_Cliente;
		this.Observacao=observacao;
		this.status="ANDAMENTO";
		this.custoHH	= 0;
		this.cargaHoraria=1;
		this.valorPecas =0;
		this.valorTotal =contValorTotal(this.custoHH,this.valorPecas);
		
		
	}
	public Ordem_De_Servico() {
		super();
		this.id_Funcionario =0;
		this.id_Cliente = 0;
		this.Observacao=null;
	}
	
	public int getFuncionario() {
		return id_Funcionario;
	}
	public void setFuncionario(int id_Funcionario) {
		this.id_Funcionario = id_Funcionario;
	}
	public int getCliente() {
		return id_Cliente;
	}
	public void setCliente(int cliente) {
		this.id_Cliente = cliente;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getValorTotal() {
		contValorTotal(this.custoHH,this.valorPecas);
		return valorTotal;
	}
	private float contValorTotal( float custoHH,float valorPecas) {
		return this.valorTotal = custoHH+valorPecas;
	}
	public float getValorPecas() {
		contValorTotal(this.custoHH,this.valorPecas);
		return valorPecas;
	}
	public void setValorPecas(float valorPecas) {
		contValorTotal(this.custoHH,this.valorPecas);
		this.valorPecas = valorPecas;
	}
	public int getCargaHoraria() {
		contValorTotal(this.custoHH,this.valorPecas);
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria, int id ){
		contValorTotal(this.custoHH,this.valorPecas);
		this.cargaHoraria = cargaHoraria;
	}
	public String getObservacao() {
		return Observacao;
	}
	public void setObservacao(String observacao) {
		Observacao = observacao;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
