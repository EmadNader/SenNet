/**
 *
 * $Id$
 */
package org.wsn.sennet.validation;

import org.eclipse.emf.common.util.EList;

import org.wsn.sennet.AbstractSensor;

import org.wsn.sennet.enums.Position;

/**
 * A sample validator interface for {@link org.wsn.sennet.AbstractNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AbstractNodeValidator {
	boolean validate();

	boolean validatePosition(Position value);
	boolean validateNodeResources(EList<AbstractSensor> value);
}
