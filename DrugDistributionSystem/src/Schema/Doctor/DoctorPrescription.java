/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Doctor;

import java.util.Date;

/**
 *
 * @author junaidpatel
 */
public class DoctorPrescription {
    private String NameOfMedicine;
    private int NoOfDays;
    private int TimesInADay;
    private String diagnosis;
    private Date DateOfPrescription;
    private String networkName;
    
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }


    public int getNoOfDays() {
        return NoOfDays;
    }

    public void setNoOfDays(int NoOfDays) {
        this.NoOfDays = NoOfDays;
    }
    
    public String getNameOfMedicine() {
        return NameOfMedicine;
    }

    public void setNameOfMedicine(String NameOfMedicine) {
        this.NameOfMedicine = NameOfMedicine;
    }

    public int getTimesInADay() {
        return TimesInADay;
    }

    public void setTimesInADay(int TimesInADay) {
        this.TimesInADay = TimesInADay;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
    
    public Date getDateOfPrescription() {
        return DateOfPrescription;
    }

    public void setDateOfPrescription(Date DateOfPrescription) {
        this.DateOfPrescription = DateOfPrescription;
    }
    
}
