package pooa20181.iff.edu.br.hearthstonetopdeck.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DeckTier1 implements Serializable {


    private String nome;
    private String descricao;
    private BigDecimal dust;
    private int photo;

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


    public DeckTier1(String nome, String descricao, BigDecimal dust, int photo) {
        this.nome = nome;
        this.descricao = descricao;
        this.dust = dust;
        this.photo = photo;
    }

    public DeckTier1() {
    }
}
