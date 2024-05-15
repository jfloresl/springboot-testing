package com.jfloresl.junitapp.ejemplo.models;

import java.math.BigDecimal;

public class Cuenta {
    private String persona;
    private BigDecimal saldo;
    public void debito (BigDecimal monto){
       this.saldo= this.saldo.subtract(monto);
    }
    public void credito (BigDecimal monto){
        this.saldo=this.saldo.add(monto);
    }
    public Cuenta(String persona, BigDecimal saldo) {
        this.persona = persona;
        this.saldo=saldo;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
