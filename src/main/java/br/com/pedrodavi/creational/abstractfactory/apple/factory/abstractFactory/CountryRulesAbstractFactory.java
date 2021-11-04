package br.com.pedrodavi.creational.abstractfactory.apple.factory.abstractFactory;

import br.com.pedrodavi.creational.abstractfactory.apple.model.certificate.Certificate;
import br.com.pedrodavi.creational.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
