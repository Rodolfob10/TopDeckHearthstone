package pooa20181.iff.edu.br.hearthstonetopdeck.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Deck implements Serializable {


    private String nome;
    private String descricao;
    private BigDecimal dust;
    private int photo;
    private int photo2;

    public int getPhoto2() {
        return photo2;
    }

    public void setPhoto2(int photo2) {
        this.photo2 = photo2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public BigDecimal getDust() {
        return dust;
    }

    public void setDust(BigDecimal dust) {
        this.dust = dust;
    }

    public int getPhoto() {

        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


    public Deck(String nome, String descricao, BigDecimal dust, int photo, int photo2) {
        this.nome = nome;
        this.descricao = descricao;
        this.dust = dust;
        this.photo = photo;
        this.photo2 = photo2;
    }

    public Deck() {
    }
}
