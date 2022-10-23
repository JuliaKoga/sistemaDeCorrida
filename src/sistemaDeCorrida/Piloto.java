package sistemaDeCorrida;

public class Piloto {
    private String nome;
    private Integer idade;
    private Sexo sexo;
    private String equipe;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getIdade(){
        return idade;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public Sexo getSexo(){
        return sexo;
    }
    public void setSexo(Sexo sexo){
        this.sexo = sexo;
    }

    public String getequipe(){
        return equipe;
    }
    public void setEquipe(String equipe){
        this.equipe = equipe;
    }

    public Piloto(){}

    public Piloto(String nome,Integer idade,Sexo sexo,String equipe){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.equipe = equipe;
    }

}
