package com.example.demospringbatch.processor;

import com.example.demospringbatch.model.Persona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;


public class PersonaItemProcessor implements ItemProcessor<Persona, Persona> {
    private static final Logger LOG = LoggerFactory.getLogger(PersonaItemProcessor.class);

    @Override
    public Persona process(Persona item) throws Exception {
        String nome = item.getNome().toUpperCase();
        String sobrenome = item.getSobrenome().toUpperCase();
        String telefone = item.getTelefone();

        Persona persona = new Persona(nome,sobrenome,telefone);

        LOG.info("Convertendo ("+item+") a ("+persona+")");

        return persona;
    }


}
