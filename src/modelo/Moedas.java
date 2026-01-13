package modelo;

public enum Moedas {

    USD("Dólar Americano"),
    EUR("Euro"),
    BRL("Real Brasileiro"),
    GBP("Libra Esterlina"),
    JPY("Iene Japonês"),
    CHF("Franco Suíço"),
    CAD("Dólar Canadense"),
    AUD("Dólar Australiano"),
    NZD("Dólar Neozelandês"),
    CNY("Yuan Chinês"),

    HKD("Dólar de Hong Kong"),
    SGD("Dólar de Singapura"),
    SEK("Coroa Sueca"),
    NOK("Coroa Norueguesa"),
    DKK("Coroa Dinamarquesa"),
    MXN("Peso Mexicano"),
    ARS("Peso Argentino"),
    CLP("Peso Chileno"),
    COP("Peso Colombiano"),
    ZAR("Rand Sul-Africano"),

    INR("Rupia Indiana"),
    KRW("Won Sul-Coreano"),
    TRY("Lira Turca"),
    RUB("Rublo Russo"),
    PLN("Zloty Polonês");


    private final String descricao;

    Moedas(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getSigla() {
        return this.name();
    }

    @Override
    public String toString() {
        return name() + " - " + descricao;
    }

    public void exibirMoedas() {
        for (Moedas moedas : Moedas.values()) {
            System.out.println(moedas);
        }
    }

}
