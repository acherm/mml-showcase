/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.mml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.mml.CSVParsingConfiguration;
import org.xtext.example.mydsl.mml.CSVSeparator;
import org.xtext.example.mydsl.mml.MmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSV Parsing Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mml.impl.CSVParsingConfigurationImpl#getSep <em>Sep</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSVParsingConfigurationImpl extends MinimalEObjectImpl.Container implements CSVParsingConfiguration
{
  /**
   * The default value of the '{@link #getSep() <em>Sep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSep()
   * @generated
   * @ordered
   */
  protected static final CSVSeparator SEP_EDEFAULT = CSVSeparator.COMMA;

  /**
   * The cached value of the '{@link #getSep() <em>Sep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSep()
   * @generated
   * @ordered
   */
  protected CSVSeparator sep = SEP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CSVParsingConfigurationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MmlPackage.Literals.CSV_PARSING_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSVSeparator getSep()
  {
    return sep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSep(CSVSeparator newSep)
  {
    CSVSeparator oldSep = sep;
    sep = newSep == null ? SEP_EDEFAULT : newSep;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmlPackage.CSV_PARSING_CONFIGURATION__SEP, oldSep, sep));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MmlPackage.CSV_PARSING_CONFIGURATION__SEP:
        return getSep();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MmlPackage.CSV_PARSING_CONFIGURATION__SEP:
        setSep((CSVSeparator)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MmlPackage.CSV_PARSING_CONFIGURATION__SEP:
        setSep(SEP_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MmlPackage.CSV_PARSING_CONFIGURATION__SEP:
        return sep != SEP_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (sep: ");
    result.append(sep);
    result.append(')');
    return result.toString();
  }

} //CSVParsingConfigurationImpl
