/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema;

import Schema.Organization.AdminOrganization;
import Schema.Supplier.Product;
import Schema.WorkQueue.DoctorWorkRequest;
import Schema.WorkQueue.DrugInventoryWorkRequest;
import Schema.WorkQueue.PharmacyWorkRequest;
import java.util.Random;

/**
 *
 * @author lakshyagupta
 */
public class DataGenerator {
    
    private static String[] network = {"Washington DC","Boston", "Seattle", "Florida","Mumbai", "Delhi"};
    private static String[] hospitalName = {"Boston Medical", "Brigham","AH", "TGH", "General Hospitals", "Smile Hospitals", "Cape cod","Kokilaben","Kapadia" };
    private static String[] equipmentName = {"Expandol","Febrectal","Fensum","Influbene","Lekadol","Momentum","NeoKiddielets"};
    private static String[] medicineName = { "Crestor", "Ventolin","Synthroid",  "infliximab", "fluticasone","esomeprazole", "insulin", "rosuvastatin"};
    private static String[] organisationName = {"Doctor", "Pharmacy", "Supplier", "Transportation", "Equipment"};
    private static String[] vaccinationName = {"Meningococcal", "Tdap", "HPV", "Seasonal Flu", "Varicella", "Hepititis B", "MMR"};
    private static String[] beginning = {"kr", "ca", "Ra", "Ho", "Lj", "pg", "kre", "lop", "mat"};
    private static String[] middle = {"air", "cal", "Pla", "ghdo", "kal", "hkg", "pokre", "lojop", "mploat"};

    private static Random rand = new Random();

    public static String generateSuppliers() {
        return beginning[rand.nextInt(beginning.length)] + middle[rand.nextInt(middle.length)];
    }
    
    public static String generatePaitents() {
        return beginning[rand.nextInt(beginning.length)] + middle[rand.nextInt(middle.length)];
    }
    
    public static String generateEquipmentName() {
        return equipmentName[rand.nextInt(equipmentName.length)];
    }

    public static String generateNetwork() {
        return network[rand.nextInt(network.length)];
    }

    public static String generateVaccineName() {
        return vaccinationName[rand.nextInt(vaccinationName.length)];

    }

    public static String generateMedicine() {
        return medicineName[rand.nextInt(medicineName.length)];
    }
    
    public static String generateHospitalName() {
        return hospitalName[rand.nextInt(hospitalName.length)];
    }

    public static String generationOrganisationName() {
        return organisationName[rand.nextInt(organisationName.length)];
    }
    
    public static DrugInventoryWorkRequest InitMedicalRequest() {
        DrugInventoryWorkRequest request = new DrugInventoryWorkRequest();
        request.setEquipmentName(generateEquipmentName());
        request.setNetwork(generateNetwork());
        return request;
    }
    

    public static AdminOrganization InitOrgName() {
        AdminOrganization request = new AdminOrganization();
        request.setOrganizationName(generationOrganisationName());
        return request;
    }
    
    public static PharmacyWorkRequest InitSupplierInfo() {
        PharmacyWorkRequest request = new PharmacyWorkRequest();
        request.setSupplierName(generateSuppliers());
        request.setNetwork(generateNetwork());
        return request;
    }

    public static Product InitVaccineName() {
    Product request = new Product();
        request.setNameOfVaccine(generateVaccineName());
        request.setNameOfHospital(generateHospitalName());
        return request;
    }
    
    public static DoctorWorkRequest InitPaitenceInfo() {
        DoctorWorkRequest request = new DoctorWorkRequest();
        request.setHospitalName(generateHospitalName());
        request.setPatientName(generatePaitents());
        return request;
    }

    public static Product InitMedicineName() {
       Product request = new Product();
       request.setNameOfMedicine(generateMedicine());
       return request;
    }
    
}
