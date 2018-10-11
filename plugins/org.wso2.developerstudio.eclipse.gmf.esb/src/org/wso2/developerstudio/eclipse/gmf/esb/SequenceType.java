/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sequence Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getSequenceType()
 * @model
 * @generated
 */
public enum SequenceType implements Enumerator {
    /**
     * The '<em><b>Anonymous</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #ANONYMOUS_VALUE
     * @generated
     * @ordered
     */
    ANONYMOUS(0, "Anonymous", "Anonymous"),

    /**
     * The '<em><b>Registry Reference</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #REGISTRY_REFERENCE_VALUE
     * @generated
     * @ordered
     */
    REGISTRY_REFERENCE(1, "RegistryReference", "Registry Reference"),

    /**
     * The '<em><b>Named Reference</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #NAMED_REFERENCE_VALUE
     * @generated
     * @ordered
     */
    NAMED_REFERENCE(2, "NamedReference", "Named Reference");

    /**
     * The '<em><b>Anonymous</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Anonymous</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #ANONYMOUS
     * @model name="Anonymous"
     * @generated
     * @ordered
     */
    public static final int ANONYMOUS_VALUE = 0;

    /**
     * The '<em><b>Registry Reference</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Registry Reference</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #REGISTRY_REFERENCE
     * @model name="RegistryReference" literal="Registry Reference"
     * @generated
     * @ordered
     */
    public static final int REGISTRY_REFERENCE_VALUE = 1;

    /**
     * The '<em><b>Named Reference</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Named Reference</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #NAMED_REFERENCE
     * @model name="NamedReference" literal="Named Reference"
     * @generated
     * @ordered
     */
    public static final int NAMED_REFERENCE_VALUE = 2;

    /**
     * An array of all the '<em><b>Sequence Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final SequenceType[] VALUES_ARRAY = new SequenceType[] { ANONYMOUS, REGISTRY_REFERENCE,
            NAMED_REFERENCE, };

    /**
     * A public read-only list of all the '<em><b>Sequence Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final List<SequenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Sequence Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SequenceType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SequenceType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Sequence Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SequenceType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SequenceType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Sequence Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SequenceType get(int value) {
        switch (value) {
        case ANONYMOUS_VALUE:
            return ANONYMOUS;
        case REGISTRY_REFERENCE_VALUE:
            return REGISTRY_REFERENCE;
        case NAMED_REFERENCE_VALUE:
            return NAMED_REFERENCE;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private SequenceType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} // SequenceType
