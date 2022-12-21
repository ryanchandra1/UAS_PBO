package com.example.projectuas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CariObatController {

    @FXML
    private Button btnA;

    @FXML
    private Button btnB;

    @FXML
    private Button btnC;

    @FXML
    private Button btnD;

    @FXML
    private Button btnE;

    @FXML
    private Button btnF;

    @FXML
    private Button btnG;

    @FXML
    private Button btnH;

    @FXML
    private Button btnI;

    @FXML
    private Button btnJ;

    @FXML
    private Button btnK;

    @FXML
    private Button btnKeluar;

    @FXML
    private Button btnL;

    @FXML
    private Button btnM;

    @FXML
    private Button btnN;

    @FXML
    private Button btnO;

    @FXML
    private Button btnP;

    @FXML
    private Button btnR;

    @FXML
    private Button btnS;

    @FXML
    private Button btnT;

    @FXML
    private Button btnU;

    @FXML
    private Button btnV;

    @FXML
    private Button btnW;

    @FXML
    private Button btnX;

    @FXML
    private Button btnY;

    @FXML
    private Button btnZ;

       @FXML
    private Button btnObat1;
       @FXML
       private Button btnObat3;

    @FXML
    private Button btnObat10;

    @FXML
    private Button btnObat11;

    @FXML
    private Button btnObat12;

    @FXML
    private Button btnObat13;

    @FXML
    private Button btnObat14;

    @FXML
    private Button btnObat15;

    @FXML
    private Button btnObat16;

    @FXML
    private Button btnObat17;

    @FXML
    private Button btnObat18;

    @FXML
    private Button btnObat19;

    @FXML
    private Button btnObat2;

    @FXML
    private Button btnObat20;

    @FXML
    private Button btnObat21;

    @FXML
    private Button btnObat22;

    @FXML
    private Button btnObat23;

    @FXML
    private Button btnObat24;

    @FXML
    private Button btnObat25;

    @FXML
    private Button btnObat26;

    @FXML
    private Button btnObat27;

    @FXML
    private Button btnObat28;

    @FXML
    private Button btnObat29;

    @FXML
    private Button btnObat30;

    @FXML
    private Button btnObat31;

    @FXML
    private Button btnObat32;

    @FXML
    private Button btnObat33;

    @FXML
    private Button btnObat34;

    @FXML
    private Button btnObat35;

    @FXML
    private Button btnObat36;

    @FXML
    private Button btnObat37;

    @FXML
    private Button btnObat38;

    @FXML
    private Button btnObat39;

    @FXML
    private Button btnObat4;

    @FXML
    private Button btnObat40;

    @FXML
    private Button btnObat41;

    @FXML
    private Button btnObat42;

    @FXML
    private Button btnObat43;

    @FXML
    private Button btnObat44;

    @FXML
    private Button btnObat45;

    @FXML
    private Button btnObat46;

    @FXML
    private Button btnObat47;

    @FXML
    private Button btnObat48;

    @FXML
    private Button btnObat49;

    @FXML
    private Button btnObat5;

    @FXML
    private Button btnObat50;

    @FXML
    private Button btnObat51;

    @FXML
    private Button btnObat52;

    @FXML
    private Button btnObat53;

    @FXML
    private Button btnObat54;

    @FXML
    private Button btnObat55;

    @FXML
    private Button btnObat6;

    @FXML
    private Button btnObat7;

    @FXML
    private Button btnObat8;

    @FXML
    private Button btnObat9;
    @FXML
    private Button btnQ;
    @FXML
    private Label lblKosong;
    @FXML
    private Button btnCoba;
    @FXML
    private Label lblDeskripsiObat;
    @FXML
    private Label lblCoba;
    @FXML
    void btnonactionKeluar(ActionEvent event) {
        Stage stage = (Stage) btnKeluar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnonactionA(ActionEvent event) {
        lblDeskripsiObat.setText("");
        lblKosong.setText("");
        btnObat1.setText("Acarbose");
        btnObat2.setText("Acetazolamide");
        btnObat3.setText("Acetylcysteine");
        btnObat4.setText("Acrivastine");
        btnObat5.setText("Acyclover Topical");
        btnObat6.setText("Acyclovir");
        btnObat7.setText("Albendazole");
        btnObat8.setText("Albumin");
        btnObat9.setText("Alginic Acid");
        btnObat10.setText("Allopurinol");
        btnObat11.setText("Allylestrenol");
        btnObat12.setText("Alpha-Lipoic Acid");
        btnObat13.setText("Alprazolam");
        btnObat14.setText("Aluminium Hidroksida");
        btnObat15.setText("Ambroxol");
        btnObat16.setText("Amikacin");
        btnObat17.setText("Amineptine");
        btnObat18.setText("Aminofilin");
        btnObat19.setText("Amiodarone");
        btnObat20.setText("Amitriptyline");
        btnObat21.setText("Amlodipine");
        btnObat22.setText("Amonium Klorida");
        btnObat23.setText("Amoxapine");
        btnObat24.setText("Amoxicillin");
        btnObat25.setText("Amphotericin B");
        btnObat26.setText("Ampicillin");
        btnObat27.setText("Anidulafungin");
        btnObat28.setText("Apixaban");
        btnObat29.setText("Arginine");
        btnObat30.setText("Aripiprazole");
        btnObat31.setText("Asam Alginat");
        btnObat32.setText("Asam Amino");
        btnObat33.setText("Asam Borat");
        btnObat34.setText("Asam Glikolat");
        btnObat35.setText("Asam Mefenamat");
        btnObat36.setText("Asam Salisilat");
        btnObat37.setText("Asam Traneksamat");
        btnObat38.setText("Asam Ursodeoksikolat");
        btnObat39.setText("Asam Valproat");
        btnObat40.setText("Asenapine");
        btnObat41.setText("Asetilkolin");
        btnObat42.setText("Aspirin");
        btnObat43.setText("Astaxanthin");
        btnObat44.setText("Astemizole");
        btnObat45.setText("Atenolol");
        btnObat46.setText("Atorvastatin");
        btnObat47.setText("Atropin");
        btnObat48.setText("Attapulgite");
        btnObat49.setText("Azatadine");
        btnObat50.setText("Azathioprine");
        btnObat51.setText("Azithromycin");
        btnObat52.setText("");
        btnObat53.setText("");
        btnObat54.setText("");
        btnObat55.setText("");


    }

    @FXML
    void btnonactionB(ActionEvent event) {
        lblDeskripsiObat.setText("");
        lblKosong.setText("");
        btnObat1.setText("Bacitracin");
        btnObat2.setText("Baclofen");
        btnObat3.setText("Bambuterol");
        btnObat4.setText("Benazepril");
        btnObat5.setText("Benzoyl Peroxide");
        btnObat6.setText("Betametason");
        btnObat7.setText("Biotin");
        btnObat8.setText("Bisacodyl");
        btnObat9.setText("Boron");
        btnObat10.setText("Botulinum Toxin");
        btnObat11.setText("Bromelain");
        btnObat12.setText("Bromhexine");
        btnObat13.setText("Bromocriptine");
        btnObat14.setText("Brompheniramine");
        btnObat15.setText("Budesonide");
        btnObat16.setText("Bupivacaine");
        btnObat17.setText("Bupropion");
        btnObat18.setText("Busulfan");
        btnObat19.setText("");
        btnObat20.setText("");
        btnObat21.setText("");
        btnObat22.setText("");
        btnObat23.setText("");
        btnObat24.setText("");
        btnObat25.setText("");
        btnObat26.setText("");
        btnObat27.setText("");
        btnObat28.setText("");
        btnObat29.setText("");
        btnObat30.setText("");
        btnObat31.setText("");
        btnObat32.setText("");
        btnObat33.setText("");
        btnObat34.setText("");
        btnObat35.setText("");
        btnObat36.setText("");
        btnObat37.setText("");
        btnObat38.setText("");
        btnObat39.setText("");
        btnObat40.setText("");
        btnObat41.setText("");
        btnObat42.setText("");
        btnObat43.setText("");
        btnObat44.setText("");
        btnObat45.setText("");
        btnObat46.setText("");
        btnObat47.setText("");
        btnObat48.setText("");
        btnObat49.setText("");
        btnObat50.setText("");
        btnObat51.setText("");
        btnObat52.setText("");
        btnObat53.setText("");
        btnObat54.setText("");
        btnObat55.setText("");

    }

    @FXML
    void btnonactionC(ActionEvent event) {
        lblDeskripsiObat.setText("");
        lblKosong.setText("");
        btnObat1.setText("Calcitriol");
        btnObat2.setText("Calcium Acetate");
        btnObat3.setText("Calcium Carbonate");
        btnObat4.setText("Candesartan");
        btnObat5.setText("Captopril");
        btnObat6.setText("Carbamazepine");
        btnObat7.setText("Carbimazole");
        btnObat8.setText("Carvedilol");
        btnObat9.setText("Caspofungin");
        btnObat10.setText("Cefadroxil");
        btnObat11.setText("Cefazolin");
        btnObat12.setText("Cefepime");
        btnObat13.setText("Cefidinir");
        btnObat14.setText("Cefixime");
        btnObat15.setText("Cefoperazone");
        btnObat16.setText("Cefotaxim");
        btnObat17.setText("Ceftazidime");
        btnObat18.setText("Ceftriaxone");
        btnObat19.setText("Cefuroxime");
        btnObat20.setText("Celecoxib");
        btnObat21.setText("Cephalexin");
        btnObat22.setText("Cetirizine");
        btnObat23.setText("Chlordiazepoxide");
        btnObat24.setText("Chlorpheniramine");
        btnObat25.setText("Chlorpromazine");
        btnObat26.setText("Cholestyramine");
        btnObat27.setText("Ciclosporin");
        btnObat28.setText("Cilostazol");
        btnObat29.setText("Cimetidine");
        btnObat30.setText("Cinnarizine");
        btnObat31.setText("Ciprofloxacin");
        btnObat32.setText("Cisplatin");
        btnObat33.setText("Citalopram");
        btnObat34.setText("Citicolin");
        btnObat35.setText("Claritrhomycin");
        btnObat36.setText("Clindamycin");
        btnObat37.setText("Clobazam");
        btnObat38.setText("Clonazepam");
        btnObat39.setText("Clonidine");
        btnObat40.setText("Clopidogrel");
        btnObat41.setText("Clotrimazole");
        btnObat42.setText("Clozapine");
        btnObat43.setText("Co-trimoxazole");
        btnObat44.setText("Codeine");
        btnObat45.setText("Coenzyme Q10");
        btnObat46.setText("Colchicine");
        btnObat47.setText("Colistin");
        btnObat48.setText("Cortisone");
        btnObat49.setText("Cyclophosphamide");
        btnObat50.setText("Cyproheptadine");
        btnObat51.setText("");
        btnObat52.setText("");
        btnObat53.setText("");
        btnObat54.setText("");
        btnObat55.setText("");
    }

    @FXML
    void btnonactionD(ActionEvent event) {
        lblDeskripsiObat.setText("");
        lblKosong.setText("");
        btnObat1.setText("Dabigatran");
        btnObat2.setText("Desloratadine");
        btnObat3.setText("Desoximetasone");
        btnObat4.setText("Dexamethasone");
        btnObat5.setText("Dexchlorpheniramine");
        btnObat6.setText("Dexketoprofen");
        btnObat7.setText("Dextromethorphan");
        btnObat8.setText("Dextrose");
        btnObat9.setText("Diazepam");
        btnObat10.setText("Diclofenac");
        btnObat11.setText("Diethylcarbamazine");
        btnObat12.setText("Digoxin");
        btnObat13.setText("Diltiazem");
        btnObat14.setText("Dimenhydrinate");
        btnObat15.setText("Dimethicone");
        btnObat16.setText("Diphenhydramine");
        btnObat17.setText("Disulfiram");
        btnObat18.setText("Dobutamine");
        btnObat19.setText("Docosahexaenoic Acid (DHA)");
        btnObat20.setText("Domperidone");
        btnObat21.setText("Donepezil");
        btnObat22.setText("Dopamine");
        btnObat23.setText("Doripenem");
        btnObat24.setText("Doxycycline");
        btnObat25.setText("Duloxetine");
        btnObat26.setText("");
        btnObat27.setText("");
        btnObat28.setText("");
        btnObat29.setText("");
        btnObat30.setText("");
        btnObat31.setText("");
        btnObat32.setText("");
        btnObat33.setText("");
        btnObat34.setText("");
        btnObat35.setText("");
        btnObat36.setText("");
        btnObat37.setText("");
        btnObat38.setText("");
        btnObat39.setText("");
        btnObat40.setText("");
        btnObat41.setText("");
        btnObat42.setText("");
        btnObat43.setText("");
        btnObat44.setText("");
        btnObat45.setText("");
        btnObat46.setText("");
        btnObat47.setText("");
        btnObat48.setText("");
        btnObat49.setText("");
        btnObat50.setText("");
        btnObat51.setText("");
        btnObat52.setText("");
        btnObat53.setText("");
        btnObat54.setText("");
        btnObat55.setText("");
    }

    @FXML
    void btnonactionE(ActionEvent event) {
        lblDeskripsiObat.setText("");
        lblKosong.setText("");
        btnObat1.setText("Enalapril");
        btnObat2.setText("Eperisone");
        btnObat3.setText("Ephedrine");
        btnObat4.setText("Epinephrine");
        btnObat5.setText("Erdosteine");
        btnObat6.setText("Ergotamine");
        btnObat7.setText("Erythromycin");
        btnObat8.setText("Escitalopram");
        btnObat9.setText("Esomeprazole");
        btnObat10.setText("Estazolam");
        btnObat11.setText("Estradiol");
        btnObat12.setText("Estrogen");
        btnObat13.setText("Ethambutol");
        btnObat14.setText("Etodolac");
        btnObat15.setText("Etoricoxib");
        btnObat16.setText("");
        btnObat17.setText("");
        btnObat18.setText("");
        btnObat19.setText("");
        btnObat20.setText("");
        btnObat21.setText("");
        btnObat22.setText("");
        btnObat23.setText("");
        btnObat24.setText("");
        btnObat25.setText("");
        btnObat26.setText("");
        btnObat27.setText("");
        btnObat28.setText("");
        btnObat29.setText("");
        btnObat30.setText("");
        btnObat31.setText("");
        btnObat32.setText("");
        btnObat33.setText("");
        btnObat34.setText("");
        btnObat35.setText("");
        btnObat36.setText("");
        btnObat37.setText("");
        btnObat38.setText("");
        btnObat39.setText("");
        btnObat40.setText("");
        btnObat41.setText("");
        btnObat42.setText("");
        btnObat43.setText("");
        btnObat44.setText("");
        btnObat45.setText("");
        btnObat46.setText("");
        btnObat47.setText("");
        btnObat48.setText("");
        btnObat49.setText("");
        btnObat50.setText("");
        btnObat51.setText("");
        btnObat52.setText("");
        btnObat53.setText("");
        btnObat54.setText("");
        btnObat55.setText("");
    }

    @FXML
    void btnonactionF(ActionEvent event) {
       lblDeskripsiObat.setText("");
        lblKosong.setText("");
        btnObat1.setText("Famotidine");
        btnObat2.setText("Felodipine");
        btnObat3.setText("Fenofibrate");
        btnObat4.setText("Fentanyl");
        btnObat5.setText("Ferrous Fumarate");
        btnObat6.setText("Fexofenadine");
        btnObat7.setText("Fibrinogen");
        btnObat8.setText("Finasteride");
        btnObat9.setText("Fluconazole");
        btnObat10.setText("Flunarizin");
        btnObat11.setText("Fluoxetine");
        btnObat12.setText("Fluphenazine");
        btnObat13.setText("Fluvoxamine");
        btnObat14.setText("Fondaparinux");
        btnObat15.setText("Formaldehyde");
        btnObat16.setText("Fosinopril");
        btnObat17.setText("Furosemide");
        btnObat18.setText("");
        btnObat19.setText("");
        btnObat20.setText("");
        btnObat21.setText("");
        btnObat22.setText("");
        btnObat23.setText("");
        btnObat24.setText("");
        btnObat25.setText("");
        btnObat26.setText("");
        btnObat27.setText("");
        btnObat28.setText("");
        btnObat29.setText("");
        btnObat30.setText("");
        btnObat31.setText("");
        btnObat32.setText("");
        btnObat33.setText("");
        btnObat34.setText("");
        btnObat35.setText("");
        btnObat36.setText("");
        btnObat37.setText("");
        btnObat38.setText("");
        btnObat39.setText("");
        btnObat40.setText("");
        btnObat41.setText("");
        btnObat42.setText("");
        btnObat43.setText("");
        btnObat44.setText("");
        btnObat45.setText("");
        btnObat46.setText("");
        btnObat47.setText("");
        btnObat48.setText("");
        btnObat49.setText("");
        btnObat50.setText("");
        btnObat51.setText("");
        btnObat52.setText("");
        btnObat53.setText("");
        btnObat54.setText("");
        btnObat55.setText("");
    }

    @FXML
    void btnonactionG(ActionEvent event) {
       lblDeskripsiObat.setText("");
        lblKosong.setText("");
        btnObat1.setText("Gabapentin");
        btnObat2.setText("Galantamine");
        btnObat3.setText("Gemfibrozil");
        btnObat4.setText("Gentamicin");
        btnObat5.setText("Glibenclamide");
        btnObat6.setText("Glimepiride");
        btnObat7.setText("Gliquidone");
        btnObat8.setText("Glucagon");
        btnObat9.setText("Glucosamine");
        btnObat10.setText("Glycerol");
        btnObat11.setText("Glycopyrronium bromide");
        btnObat12.setText("Granisetron");
        btnObat13.setText("Griseofulvin");
        btnObat14.setText("Guaifenesin");
        btnObat15.setText("");
        btnObat16.setText("");
        btnObat17.setText("");
        btnObat18.setText("");
        btnObat19.setText("");
        btnObat20.setText("");
        btnObat21.setText("");
        btnObat22.setText("");
        btnObat23.setText("");
        btnObat24.setText("");
        btnObat25.setText("");
        btnObat26.setText("");
        btnObat27.setText("");
        btnObat28.setText("");
        btnObat29.setText("");
        btnObat30.setText("");
        btnObat31.setText("");
        btnObat32.setText("");
        btnObat33.setText("");
        btnObat34.setText("");
        btnObat35.setText("");
        btnObat36.setText("");
        btnObat37.setText("");
        btnObat38.setText("");
        btnObat39.setText("");
        btnObat40.setText("");
        btnObat41.setText("");
        btnObat42.setText("");
        btnObat43.setText("");
        btnObat44.setText("");
        btnObat45.setText("");
        btnObat46.setText("");
        btnObat47.setText("");
        btnObat48.setText("");
        btnObat49.setText("");
        btnObat50.setText("");
        btnObat51.setText("");
        btnObat52.setText("");
        btnObat53.setText("");
        btnObat54.setText("");
        btnObat55.setText("");

    }

    @FXML
    void btnonactionH(ActionEvent event) {
       lblDeskripsiObat.setText("");
        lblKosong.setText("");
        btnObat1.setText("Haloperidol");
        btnObat2.setText("Heparin");
        btnObat3.setText("Homochlorcyclizine dihydrochloride");
        btnObat4.setText("Human Chorionic Gonadotropin");
        btnObat5.setText("Hydrochlorothiazide");
        btnObat6.setText("Hydrocortisone");
        btnObat7.setText("Hydroquinone");
        btnObat8.setText("Hyoscine");
        btnObat9.setText("Hyoscyamine");
        btnObat10.setText("");
        btnObat11.setText("");
        btnObat12.setText("");
        btnObat13.setText("");
        btnObat14.setText("");
        btnObat15.setText("");
        btnObat16.setText("");
        btnObat17.setText("");
        btnObat18.setText("");
        btnObat19.setText("");
        btnObat20.setText("");
        btnObat21.setText("");
        btnObat22.setText("");
        btnObat23.setText("");
        btnObat24.setText("");
        btnObat25.setText("");
        btnObat26.setText("");
        btnObat27.setText("");
        btnObat28.setText("");
        btnObat29.setText("");
        btnObat30.setText("");
        btnObat31.setText("");
        btnObat32.setText("");
        btnObat33.setText("");
        btnObat34.setText("");
        btnObat35.setText("");
        btnObat36.setText("");
        btnObat37.setText("");
        btnObat38.setText("");
        btnObat39.setText("");
        btnObat40.setText("");
        btnObat41.setText("");
        btnObat42.setText("");
        btnObat43.setText("");
        btnObat44.setText("");
        btnObat45.setText("");
        btnObat46.setText("");
        btnObat47.setText("");
        btnObat48.setText("");
        btnObat49.setText("");
        btnObat50.setText("");
        btnObat51.setText("");
        btnObat52.setText("");
        btnObat53.setText("");
        btnObat54.setText("");
        btnObat55.setText("");

    }

    @FXML
    void btnonactionI(ActionEvent event) {
        lblDeskripsiObat.setText("");
        lblKosong.setText("");
        btnObat1.setText("Ibuprofen");
        btnObat2.setText("Iloprost");
        btnObat3.setText("Imipramine");
        btnObat4.setText("Indinavir");
        btnObat5.setText("Indomethacin");
        btnObat6.setText("Insulin");
        btnObat7.setText("Ipratropium bromide");
        btnObat8.setText("Irbesartan");
        btnObat9.setText("Isoniazid");
        btnObat10.setText("Isosorbide Dinitrate");
        btnObat11.setText("Isotretinoin");
        btnObat12.setText("Isoxsuorine HCI");
        btnObat13.setText("Isradipine");
        btnObat14.setText("Itraconazole");
        btnObat15.setText("Ivermectin");
        btnObat16.setText("");
        btnObat17.setText("");
        btnObat18.setText("");
        btnObat19.setText("");
        btnObat20.setText("");
        btnObat21.setText("");
        btnObat22.setText("");
        btnObat23.setText("");
        btnObat24.setText("");
        btnObat25.setText("");
        btnObat26.setText("");
        btnObat27.setText("");
        btnObat28.setText("");
        btnObat29.setText("");
        btnObat30.setText("");
        btnObat31.setText("");
        btnObat32.setText("");
        btnObat33.setText("");
        btnObat34.setText("");
        btnObat35.setText("");
        btnObat36.setText("");
        btnObat37.setText("");
        btnObat38.setText("");
        btnObat39.setText("");
        btnObat40.setText("");
        btnObat41.setText("");
        btnObat42.setText("");
        btnObat43.setText("");
        btnObat44.setText("");
        btnObat45.setText("");
        btnObat46.setText("");
        btnObat47.setText("");
        btnObat48.setText("");
        btnObat49.setText("");
        btnObat50.setText("");
        btnObat51.setText("");
        btnObat52.setText("");
        btnObat53.setText("");
        btnObat54.setText("");
        btnObat55.setText("");

    }

    @FXML
    void btnonactionJ(ActionEvent event) {
        lblDeskripsiObat.setText("");
        lblKosong.setText("Tidak Ditemukan");
        btnObat1.setText("");
        btnObat2.setText("");
        btnObat3.setText("");
        btnObat4.setText("");
        btnObat5.setText("");
        btnObat6.setText("");
        btnObat7.setText("");
        btnObat8.setText("");
        btnObat9.setText("");
        btnObat10.setText("");
        btnObat11.setText("");
        btnObat12.setText("");
        btnObat13.setText("");
        btnObat14.setText("");
        btnObat15.setText("");
        btnObat16.setText("");
        btnObat17.setText("");
        btnObat18.setText("");
        btnObat19.setText("");
        btnObat20.setText("");
        btnObat21.setText("");
        btnObat22.setText("");
        btnObat23.setText("");
        btnObat24.setText("");
        btnObat25.setText("");
        btnObat26.setText("");
        btnObat27.setText("");
        btnObat28.setText("");
        btnObat29.setText("");
        btnObat30.setText("");
        btnObat31.setText("");
        btnObat32.setText("");
        btnObat33.setText("");
        btnObat34.setText("");
        btnObat35.setText("");
        btnObat36.setText("");
        btnObat37.setText("");
        btnObat38.setText("");
        btnObat39.setText("");
        btnObat40.setText("");
        btnObat41.setText("");
        btnObat42.setText("");
        btnObat43.setText("");
        btnObat44.setText("");
        btnObat45.setText("");
        btnObat46.setText("");
        btnObat47.setText("");
        btnObat48.setText("");
        btnObat49.setText("");
        btnObat50.setText("");
        btnObat51.setText("");
        btnObat52.setText("");
        btnObat53.setText("");
        btnObat54.setText("");
        btnObat55.setText("");

    }

    @FXML
    void btnonactionK(ActionEvent event) {
        lblDeskripsiObat.setText("");
        lblKosong.setText("");
        btnObat1.setText("Kanamycin");
        btnObat2.setText("Kaolin");
        btnObat3.setText("Ketamine");
        btnObat4.setText("Ketoconazole");
        btnObat5.setText("Ketoprofen");
        btnObat6.setText("Ketorolac");
        btnObat7.setText("Ketotifen");
        btnObat8.setText("Kloramfenikol");
        btnObat9.setText("");
        btnObat10.setText("");
        btnObat11.setText("");
        btnObat12.setText("");
        btnObat13.setText("");
        btnObat14.setText("");
        btnObat15.setText("");
        btnObat16.setText("");
        btnObat17.setText("");
        btnObat18.setText("");
        btnObat19.setText("");
        btnObat20.setText("");
        btnObat21.setText("");
        btnObat22.setText("");
        btnObat23.setText("");
        btnObat24.setText("");
        btnObat25.setText("");
        btnObat26.setText("");
        btnObat27.setText("");
        btnObat28.setText("");
        btnObat29.setText("");
        btnObat30.setText("");
        btnObat31.setText("");
        btnObat32.setText("");
        btnObat33.setText("");
        btnObat34.setText("");
        btnObat35.setText("");
        btnObat36.setText("");
        btnObat37.setText("");
        btnObat38.setText("");
        btnObat39.setText("");
        btnObat40.setText("");
        btnObat41.setText("");
        btnObat42.setText("");
        btnObat43.setText("");
        btnObat44.setText("");
        btnObat45.setText("");
        btnObat46.setText("");
        btnObat47.setText("");
        btnObat48.setText("");
        btnObat49.setText("");
        btnObat50.setText("");
        btnObat51.setText("");
        btnObat52.setText("");
        btnObat53.setText("");
        btnObat54.setText("");
        btnObat55.setText("");

    }

    @FXML
    void btnonactionL(ActionEvent event) {
        lblDeskripsiObat.setText("");
        lblKosong.setText("");
        btnObat1.setText("L-Glutamine");
        btnObat2.setText("Lactic Acid");
        btnObat3.setText("Lactobacillus Acidophilus");
        btnObat4.setText("Lactobacillus acidophilus");
        btnObat5.setText("Lactulose");
        btnObat6.setText("Lanolin");
        btnObat7.setText("Lansoprazole");
        btnObat8.setText("Levodopa");
        btnObat9.setText("Levofloxacin");
        btnObat10.setText("Levonorgestrel");
        btnObat11.setText("Lidocaine");
        btnObat12.setText("Lincomycin");
        btnObat13.setText("Lisinopril");
        btnObat14.setText("Lithium");
        btnObat15.setText("Loperamide");
        btnObat16.setText("Loratadine");
        btnObat17.setText("Lorazepam");
        btnObat18.setText("Losartan");
        btnObat19.setText("Lovastatin");
        btnObat20.setText("Lutein");
        btnObat21.setText("Lysine");
        btnObat22.setText("");
        btnObat23.setText("");
        btnObat24.setText("");
        btnObat25.setText("");
        btnObat26.setText("");
        btnObat27.setText("");
        btnObat28.setText("");
        btnObat29.setText("");
        btnObat30.setText("");
        btnObat31.setText("");
        btnObat32.setText("");
        btnObat33.setText("");
        btnObat34.setText("");
        btnObat35.setText("");
        btnObat36.setText("");
        btnObat37.setText("");
        btnObat38.setText("");
        btnObat39.setText("");
        btnObat40.setText("");
        btnObat41.setText("");
        btnObat42.setText("");
        btnObat43.setText("");
        btnObat44.setText("");
        btnObat45.setText("");
        btnObat46.setText("");
        btnObat47.setText("");
        btnObat48.setText("");
        btnObat49.setText("");
        btnObat50.setText("");
        btnObat51.setText("");
        btnObat52.setText("");
        btnObat53.setText("");
        btnObat54.setText("");
        btnObat55.setText("");

    }

    @FXML
    void btnonactionM(ActionEvent event) {
        lblDeskripsiObat.setText("");
        lblKosong.setText("");
        btnObat1.setText("Magnesium Hidroksida");
        btnObat2.setText("Manitol");
        btnObat3.setText("Mebhydrolin");
        btnObat4.setText("Meloxicam");
        btnObat5.setText("Memantine");
        btnObat6.setText("Meropenem");
        btnObat7.setText("Metamfetamin");
        btnObat8.setText("Metampicillin");
        btnObat9.setText("Metformin");
        btnObat10.setText("Methadone");
        btnObat11.setText("Methisoprinol");
        btnObat12.setText("Methotrexate");
        btnObat13.setText("Methylcobalamin");
        btnObat14.setText("Methylprednisolone");
        btnObat15.setText("Metil Salisilat");
        btnObat16.setText("Metildopa");
        btnObat17.setText("Metoclopramide");
        btnObat18.setText("Metoprolol");
        btnObat19.setText("Metronidazole");
        btnObat20.setText("Miconazole");
        btnObat21.setText("Midazolam");
        btnObat22.setText("Minoxidil");
        btnObat23.setText("Misoprostol");
        btnObat24.setText("Modafinil");
        btnObat25.setText("Montelukast");
        btnObat26.setText("Morfin");
        btnObat27.setText("Moxifloxacin");
        btnObat28.setText("Mupirocin");
        btnObat29.setText("");
        btnObat30.setText("");
        btnObat31.setText("");
        btnObat32.setText("");
        btnObat33.setText("");
        btnObat34.setText("");
        btnObat35.setText("");
        btnObat36.setText("");
        btnObat37.setText("");
        btnObat38.setText("");
        btnObat39.setText("");
        btnObat40.setText("");
        btnObat41.setText("");
        btnObat42.setText("");
        btnObat43.setText("");
        btnObat44.setText("");
        btnObat45.setText("");
        btnObat46.setText("");
        btnObat47.setText("");
        btnObat48.setText("");
        btnObat49.setText("");
        btnObat50.setText("");
        btnObat51.setText("");
        btnObat52.setText("");
        btnObat53.setText("");
        btnObat54.setText("");
        btnObat55.setText("");

    }

    @FXML
    void btnonactionN(ActionEvent event) {
        lblDeskripsiObat.setText("");
        lblKosong.setText("");
        btnObat1.setText("Naltrexone");
        btnObat2.setText("Naproxen");
        btnObat3.setText("Nateglinide");
        btnObat4.setText("Natrium Bikarbonat");
        btnObat5.setText("Nebivolol");
        btnObat6.setText("Nedocromil");
        btnObat7.setText("Nefazodone");
        btnObat8.setText("Neomycin");
        btnObat9.setText("Neostigmine");
        btnObat10.setText("Nepafenac");
        btnObat11.setText("Nesiritide");
        btnObat12.setText("Nicardipine");
        btnObat13.setText("Nicorandil");
        btnObat14.setText("Nicotinamide");
        btnObat15.setText("Nifedipine");
        btnObat16.setText("Nifuroxazide");
        btnObat17.setText("Nilotinib");
        btnObat18.setText("Nimorazole");
        btnObat19.setText("Nimustine");
        btnObat20.setText("Nisoldipine");
        btnObat21.setText("Nitrazepam");
        btnObat22.setText("Nitrofurantoin");
        btnObat23.setText("Nitrogliserin");
        btnObat24.setText("Nizatidine");
        btnObat25.setText("Nordazepam");
        btnObat26.setText("Norepinephrine");
        btnObat27.setText("Norethisterone");
        btnObat28.setText("Noscapine");
        btnObat29.setText("Nystatin");
        btnObat30.setText("");
        btnObat31.setText("");
        btnObat32.setText("");
        btnObat33.setText("");
        btnObat34.setText("");
        btnObat35.setText("");
        btnObat36.setText("");
        btnObat37.setText("");
        btnObat38.setText("");
        btnObat39.setText("");
        btnObat40.setText("");
        btnObat41.setText("");
        btnObat42.setText("");
        btnObat43.setText("");
        btnObat44.setText("");
        btnObat45.setText("");
        btnObat46.setText("");
        btnObat47.setText("");
        btnObat48.setText("");
        btnObat49.setText("");
        btnObat50.setText("");
        btnObat51.setText("");
        btnObat52.setText("");
        btnObat53.setText("");
        btnObat54.setText("");
        btnObat55.setText("");

    }

    @FXML
    void btnonactionO(ActionEvent event) {
        lblDeskripsiObat.setText("");
        lblKosong.setText("Tidak Ditemukan");
        btnObat1.setText("");
        btnObat2.setText("");
        btnObat3.setText("");
        btnObat4.setText("");
        btnObat5.setText("");
        btnObat6.setText("");
        btnObat7.setText("");
        btnObat8.setText("");
        btnObat9.setText("");
        btnObat10.setText("");
        btnObat11.setText("");
        btnObat12.setText("");
        btnObat13.setText("");
        btnObat14.setText("");
        btnObat15.setText("");
        btnObat16.setText("");
        btnObat17.setText("");
        btnObat18.setText("");
        btnObat19.setText("");
        btnObat20.setText("");
        btnObat21.setText("");
        btnObat22.setText("");
        btnObat23.setText("");
        btnObat24.setText("");
        btnObat25.setText("");
        btnObat26.setText("");
        btnObat27.setText("");
        btnObat28.setText("");
        btnObat29.setText("");
        btnObat30.setText("");
        btnObat31.setText("");
        btnObat32.setText("");
        btnObat33.setText("");
        btnObat34.setText("");
        btnObat35.setText("");
        btnObat36.setText("");
        btnObat37.setText("");
        btnObat38.setText("");
        btnObat39.setText("");
        btnObat40.setText("");
        btnObat41.setText("");
        btnObat42.setText("");
        btnObat43.setText("");
        btnObat44.setText("");
        btnObat45.setText("");
        btnObat46.setText("");
        btnObat47.setText("");
        btnObat48.setText("");
        btnObat49.setText("");
        btnObat50.setText("");
        btnObat51.setText("");
        btnObat52.setText("");
        btnObat53.setText("");
        btnObat54.setText("");
        btnObat55.setText("");

    }

    @FXML
    void btnonactionP(ActionEvent event) {
        lblDeskripsiObat.setText("");
        lblKosong.setText("");
        btnObat1.setText("Pantoprazole");
        btnObat2.setText("Papaverine");
        btnObat3.setText("Paracetamol");
        btnObat4.setText("Parecoxib");
        btnObat5.setText("Paromomycin");
        btnObat6.setText("Pefloxacin");
        btnObat7.setText("Penbutolol");
        btnObat8.setText("Penciclovir");
        btnObat9.setText("Perindopril");
        btnObat10.setText("Permethrin");
        btnObat11.setText("Phenobarbital");
        btnObat12.setText("Phenylbutazone");
        btnObat13.setText("Phenylephrine");
        btnObat14.setText("Phenylpropanolamine");
        btnObat15.setText("Phenytoin");
        btnObat16.setText("Pilocarpine");
        btnObat17.setText("Pioglitazone");
        btnObat18.setText("Piracetam");
        btnObat19.setText("Piroxicam");
        btnObat20.setText("Policresulen");
        btnObat21.setText("Potassium Acetate");
        btnObat22.setText("Povidone Iodine");
        btnObat23.setText("Pramipexole");
        btnObat24.setText("Praziquantel");
        btnObat25.setText("Prednisolone");
        btnObat26.setText("Prednisone");
        btnObat27.setText("Pregabalin");
        btnObat28.setText("Probenecid");
        btnObat29.setText("Procainamide");
        btnObat30.setText("Prochlorperazine");
        btnObat31.setText("Progesteron");
        btnObat32.setText("Promethazine");
        btnObat33.setText("Propofol");
        btnObat34.setText("Propranolol");
        btnObat35.setText("Propylthiouracil");
        btnObat36.setText("Pseudoephedrine");
        btnObat37.setText("Pyrazinamide");
        btnObat38.setText("Pyridoxine");
        btnObat39.setText("");
        btnObat40.setText("");
        btnObat41.setText("");
        btnObat42.setText("");
        btnObat43.setText("");
        btnObat44.setText("");
        btnObat45.setText("");
        btnObat46.setText("");
        btnObat47.setText("");
        btnObat48.setText("");
        btnObat49.setText("");
        btnObat50.setText("");
        btnObat51.setText("");
        btnObat52.setText("");
        btnObat53.setText("");
        btnObat54.setText("");
        btnObat55.setText("");

    }
    @FXML
    void btnonactionQ(ActionEvent event) {
        lblDeskripsiObat.setText("");
        lblKosong.setText("");
        btnObat1.setText("Quinidine");
        btnObat2.setText("Quinine");
        btnObat3.setText("");
        btnObat4.setText("");
        btnObat5.setText("");
        btnObat6.setText("");
        btnObat7.setText("");
        btnObat8.setText("");
        btnObat9.setText("");
        btnObat10.setText("");
        btnObat11.setText("");
        btnObat12.setText("");
        btnObat13.setText("");
        btnObat14.setText("");
        btnObat15.setText("");
        btnObat16.setText("");
        btnObat17.setText("");
        btnObat18.setText("");
        btnObat19.setText("");
        btnObat20.setText("");
        btnObat21.setText("");
        btnObat22.setText("");
        btnObat23.setText("");
        btnObat24.setText("");
        btnObat25.setText("");
        btnObat26.setText("");
        btnObat27.setText("");
        btnObat28.setText("");
        btnObat29.setText("");
        btnObat30.setText("");
        btnObat31.setText("");
        btnObat32.setText("");
        btnObat33.setText("");
        btnObat34.setText("");
        btnObat35.setText("");
        btnObat36.setText("");
        btnObat37.setText("");
        btnObat38.setText("");
        btnObat39.setText("");
        btnObat40.setText("");
        btnObat41.setText("");
        btnObat42.setText("");
        btnObat43.setText("");
        btnObat44.setText("");
        btnObat45.setText("");
        btnObat46.setText("");
        btnObat47.setText("");
        btnObat48.setText("");
        btnObat49.setText("");
        btnObat50.setText("");
        btnObat51.setText("");
        btnObat52.setText("");
        btnObat53.setText("");
        btnObat54.setText("");
        btnObat55.setText("");
    }

        @FXML
        void btnonactionR (ActionEvent event){
            lblDeskripsiObat.setText("");
            lblKosong.setText("");
            btnObat1.setText("Radium");
            btnObat2.setText("Ramipril");
            btnObat3.setText("Ranitidin");
            btnObat4.setText("Ranolazine");
            btnObat5.setText("Regdanvimab");
            btnObat6.setText("Resorcinol");
            btnObat7.setText("Riboflavin");
            btnObat8.setText("Rifabutin");
            btnObat9.setText("Rifampicin");
            btnObat10.setText("Risperidone");
            btnObat11.setText("Rivastigmine");
            btnObat12.setText("Ropinirole");
            btnObat13.setText("Rosuvastatin");
            btnObat14.setText("");
            btnObat15.setText("");
            btnObat16.setText("");
            btnObat17.setText("");
            btnObat18.setText("");
            btnObat19.setText("");
            btnObat20.setText("");
            btnObat21.setText("");
            btnObat22.setText("");
            btnObat23.setText("");
            btnObat24.setText("");
            btnObat25.setText("");
            btnObat26.setText("");
            btnObat27.setText("");
            btnObat28.setText("");
            btnObat29.setText("");
            btnObat30.setText("");
            btnObat31.setText("");
            btnObat32.setText("");
            btnObat33.setText("");
            btnObat34.setText("");
            btnObat35.setText("");
            btnObat36.setText("");
            btnObat37.setText("");
            btnObat38.setText("");
            btnObat39.setText("");
            btnObat40.setText("");
            btnObat41.setText("");
            btnObat42.setText("");
            btnObat43.setText("");
            btnObat44.setText("");
            btnObat45.setText("");
            btnObat46.setText("");
            btnObat47.setText("");
            btnObat48.setText("");
            btnObat49.setText("");
            btnObat50.setText("");
            btnObat51.setText("");
            btnObat52.setText("");
            btnObat53.setText("");
            btnObat54.setText("");
            btnObat55.setText("");

        }

        @FXML
        void btnonactionS (ActionEvent event){
            lblDeskripsiObat.setText("");
            lblKosong.setText("");
            btnObat1.setText("Saccharomyces boulardii Iyo");
            btnObat2.setText("Salbutamol");
            btnObat3.setText("Salmeterol");
            btnObat4.setText("Satranidazole");
            btnObat5.setText("Scopolamine");
            btnObat6.setText("Sea Water");
            btnObat7.setText("Secukinumab");
            btnObat8.setText("Selegenile");
            btnObat9.setText("Sertraline");
            btnObat10.setText("Sildenafil");
            btnObat11.setText("Simethicone");
            btnObat12.setText("Simvastatin");
            btnObat13.setText("Spiramycin");
            btnObat14.setText("Spironolactone");
            btnObat15.setText("Squalene");
            btnObat16.setText("Streptokinase");
            btnObat17.setText("Streptomycin");
            btnObat18.setText("Strontinum");
            btnObat19.setText("Sukralfat");
            btnObat20.setText("Sulfadizine");
            btnObat21.setText("Sulfamethoxazole");
            btnObat22.setText("Sulfanilamide");
            btnObat23.setText("Sulfasalazine");
            btnObat24.setText("Sumatripan");
            btnObat25.setText("");
            btnObat26.setText("");
            btnObat27.setText("");
            btnObat28.setText("");
            btnObat29.setText("");
            btnObat30.setText("");
            btnObat31.setText("");
            btnObat32.setText("");
            btnObat33.setText("");
            btnObat34.setText("");
            btnObat35.setText("");
            btnObat36.setText("");
            btnObat37.setText("");
            btnObat38.setText("");
            btnObat39.setText("");
            btnObat40.setText("");
            btnObat41.setText("");
            btnObat42.setText("");
            btnObat43.setText("");
            btnObat44.setText("");
            btnObat45.setText("");
            btnObat46.setText("");
            btnObat47.setText("");
            btnObat48.setText("");
            btnObat49.setText("");
            btnObat50.setText("");
            btnObat51.setText("");
            btnObat52.setText("");
            btnObat53.setText("");
            btnObat54.setText("");
            btnObat55.setText("");

        }

        @FXML
        void btnonactionT (ActionEvent event){
            lblDeskripsiObat.setText("");
            lblKosong.setText("");
            btnObat1.setText("Tadalafil");
            btnObat2.setText("Tafluprost");
            btnObat3.setText("Tamoxifen");
            btnObat4.setText("Tamsulosin");
            btnObat5.setText("Telmisartan");
            btnObat6.setText("Temazepan");
            btnObat7.setText("Tembaga");
            btnObat8.setText("Tenofovir");
            btnObat9.setText("Teofilin");
            btnObat10.setText("Terazosin");
            btnObat11.setText("Terbinafine");
            btnObat12.setText("Terbutaline");
            btnObat13.setText("Testosterone");
            btnObat14.setText("Tetracycline");
            btnObat15.setText("Thalimode");
            btnObat16.setText("Thiamphenicole");
            btnObat17.setText("Tiabendazole");
            btnObat18.setText("Ticlopidine");
            btnObat19.setText("Timolon");
            btnObat20.setText("Tizanidine");
            btnObat21.setText("Tobramycin");
            btnObat22.setText("Tramadol");
            btnObat23.setText("Tretinoin");
            btnObat24.setText("Triamcinolone");
            btnObat25.setText("Triclosan");
            btnObat26.setText("Trihexyphenidyl");
            btnObat27.setText("Trimethoprin");
            btnObat28.setText("Triprolidine");
            btnObat29.setText("Tripsin");
            btnObat30.setText("");
            btnObat31.setText("");
            btnObat32.setText("");
            btnObat33.setText("");
            btnObat34.setText("");
            btnObat35.setText("");
            btnObat36.setText("");
            btnObat37.setText("");
            btnObat38.setText("");
            btnObat39.setText("");
            btnObat40.setText("");
            btnObat41.setText("");
            btnObat42.setText("");
            btnObat43.setText("");
            btnObat44.setText("");
            btnObat45.setText("");
            btnObat46.setText("");
            btnObat47.setText("");
            btnObat48.setText("");
            btnObat49.setText("");
            btnObat50.setText("");
            btnObat51.setText("");
            btnObat52.setText("");
            btnObat53.setText("");
            btnObat54.setText("");
            btnObat55.setText("");

        }

        @FXML
        void btnonactionU (ActionEvent event){
            lblDeskripsiObat.setText("");
            lblKosong.setText("Tidak Ditemukan");
            btnObat1.setText("");
            btnObat2.setText("");
            btnObat3.setText("");
            btnObat4.setText("");
            btnObat5.setText("");
            btnObat6.setText("");
            btnObat7.setText("");
            btnObat8.setText("");
            btnObat9.setText("");
            btnObat10.setText("");
            btnObat11.setText("");
            btnObat12.setText("");
            btnObat13.setText("");
            btnObat14.setText("");
            btnObat15.setText("");
            btnObat16.setText("");
            btnObat17.setText("");
            btnObat18.setText("");
            btnObat19.setText("");
            btnObat20.setText("");
            btnObat21.setText("");
            btnObat22.setText("");
            btnObat23.setText("");
            btnObat24.setText("");
            btnObat25.setText("");
            btnObat26.setText("");
            btnObat27.setText("");
            btnObat28.setText("");
            btnObat29.setText("");
            btnObat30.setText("");
            btnObat31.setText("");
            btnObat32.setText("");
            btnObat33.setText("");
            btnObat34.setText("");
            btnObat35.setText("");
            btnObat36.setText("");
            btnObat37.setText("");
            btnObat38.setText("");
            btnObat39.setText("");
            btnObat40.setText("");
            btnObat41.setText("");
            btnObat42.setText("");
            btnObat43.setText("");
            btnObat44.setText("");
            btnObat45.setText("");
            btnObat46.setText("");
            btnObat47.setText("");
            btnObat48.setText("");
            btnObat49.setText("");
            btnObat50.setText("");
            btnObat51.setText("");
            btnObat52.setText("");
            btnObat53.setText("");
            btnObat54.setText("");
            btnObat55.setText("");

        }

        @FXML
        void btnonactionV (ActionEvent event){
            lblDeskripsiObat.setText("");
            lblKosong.setText("");
            btnObat1.setText("Vaksin BCG");
            btnObat2.setText("Valacyclovir");
            btnObat3.setText("Valsartan");
            btnObat4.setText("Vancomycin");
            btnObat5.setText("Vasopressin");
            btnObat6.setText("Verapamil");
            btnObat7.setText("Vildagliptin");
            btnObat8.setText("Vincristine");
            btnObat9.setText("Vitamin A");
            btnObat10.setText("Vitamin B1");
            btnObat11.setText("Vitamin B12");
            btnObat12.setText("Vitamin B2");
            btnObat13.setText("Vitamin B3 (Niacin)");
            btnObat14.setText("Vitamin B5");
            btnObat15.setText("Vitamin B6");
            btnObat16.setText("Vitamin B9 (Asam Volat)");
            btnObat17.setText("Vitamin C");
            btnObat18.setText("Vitamin D");
            btnObat19.setText("Vitamin E");
            btnObat20.setText("Vitamin K");
            btnObat21.setText("");
            btnObat22.setText("");
            btnObat23.setText("");
            btnObat24.setText("");
            btnObat25.setText("");
            btnObat26.setText("");
            btnObat27.setText("");
            btnObat28.setText("");
            btnObat29.setText("");
            btnObat30.setText("");
            btnObat31.setText("");
            btnObat32.setText("");
            btnObat33.setText("");
            btnObat34.setText("");
            btnObat35.setText("");
            btnObat36.setText("");
            btnObat37.setText("");
            btnObat38.setText("");
            btnObat39.setText("");
            btnObat40.setText("");
            btnObat41.setText("");
            btnObat42.setText("");
            btnObat43.setText("");
            btnObat44.setText("");
            btnObat45.setText("");
            btnObat46.setText("");
            btnObat47.setText("");
            btnObat48.setText("");
            btnObat49.setText("");
            btnObat50.setText("");
            btnObat51.setText("");
            btnObat52.setText("");
            btnObat53.setText("");
            btnObat54.setText("");
            btnObat55.setText("");

        }

        @FXML
        void btnonactionW (ActionEvent event){
            lblDeskripsiObat.setText("");
            lblKosong.setText("");
            btnObat1.setText("Warfarin");
            btnObat2.setText("White Petrolatum");
            btnObat3.setText("");
            btnObat4.setText("");
            btnObat5.setText("");
            btnObat6.setText("");
            btnObat7.setText("");
            btnObat8.setText("");
            btnObat9.setText("");
            btnObat10.setText("");
            btnObat11.setText("");
            btnObat12.setText("");
            btnObat13.setText("");
            btnObat14.setText("");
            btnObat15.setText("");
            btnObat16.setText("");
            btnObat17.setText("");
            btnObat18.setText("");
            btnObat19.setText("");
            btnObat20.setText("");
            btnObat21.setText("");
            btnObat22.setText("");
            btnObat23.setText("");
            btnObat24.setText("");
            btnObat25.setText("");
            btnObat26.setText("");
            btnObat27.setText("");
            btnObat28.setText("");
            btnObat29.setText("");
            btnObat30.setText("");
            btnObat31.setText("");
            btnObat32.setText("");
            btnObat33.setText("");
            btnObat34.setText("");
            btnObat35.setText("");
            btnObat36.setText("");
            btnObat37.setText("");
            btnObat38.setText("");
            btnObat39.setText("");
            btnObat40.setText("");
            btnObat41.setText("");
            btnObat42.setText("");
            btnObat43.setText("");
            btnObat44.setText("");
            btnObat45.setText("");
            btnObat46.setText("");
            btnObat47.setText("");
            btnObat48.setText("");
            btnObat49.setText("");
            btnObat50.setText("");
            btnObat51.setText("");
            btnObat52.setText("");
            btnObat53.setText("");
            btnObat54.setText("");
            btnObat55.setText("");

        }

        @FXML
        void btnonactionX (ActionEvent event){
            lblDeskripsiObat.setText("");
            lblKosong.setText("Tidak Ditemukan");
            btnObat1.setText("");
            btnObat2.setText("");
            btnObat3.setText("");
            btnObat4.setText("");
            btnObat5.setText("");
            btnObat6.setText("");
            btnObat7.setText("");
            btnObat8.setText("");
            btnObat9.setText("");
            btnObat10.setText("");
            btnObat11.setText("");
            btnObat12.setText("");
            btnObat13.setText("");
            btnObat14.setText("");
            btnObat15.setText("");
            btnObat16.setText("");
            btnObat17.setText("");
            btnObat18.setText("");
            btnObat19.setText("");
            btnObat20.setText("");
            btnObat21.setText("");
            btnObat22.setText("");
            btnObat23.setText("");
            btnObat24.setText("");
            btnObat25.setText("");
            btnObat26.setText("");
            btnObat27.setText("");
            btnObat28.setText("");
            btnObat29.setText("");
            btnObat30.setText("");
            btnObat31.setText("");
            btnObat32.setText("");
            btnObat33.setText("");
            btnObat34.setText("");
            btnObat35.setText("");
            btnObat36.setText("");
            btnObat37.setText("");
            btnObat38.setText("");
            btnObat39.setText("");
            btnObat40.setText("");
            btnObat41.setText("");
            btnObat42.setText("");
            btnObat43.setText("");
            btnObat44.setText("");
            btnObat45.setText("");
            btnObat46.setText("");
            btnObat47.setText("");
            btnObat48.setText("");
            btnObat49.setText("");
            btnObat50.setText("");
            btnObat51.setText("");
            btnObat52.setText("");
            btnObat53.setText("");
            btnObat54.setText("");
            btnObat55.setText("");

        }

        @FXML
        void btnonactionY (ActionEvent event){
            lblDeskripsiObat.setText("");
            lblKosong.setText("Tidak Ditemukan");
            btnObat1.setText("");
            btnObat2.setText("");
            btnObat3.setText("");
            btnObat4.setText("");
            btnObat5.setText("");
            btnObat6.setText("");
            btnObat7.setText("");
            btnObat8.setText("");
            btnObat9.setText("");
            btnObat10.setText("");
            btnObat11.setText("");
            btnObat12.setText("");
            btnObat13.setText("");
            btnObat14.setText("");
            btnObat15.setText("");
            btnObat16.setText("");
            btnObat17.setText("");
            btnObat18.setText("");
            btnObat19.setText("");
            btnObat20.setText("");
            btnObat21.setText("");
            btnObat22.setText("");
            btnObat23.setText("");
            btnObat24.setText("");
            btnObat25.setText("");
            btnObat26.setText("");
            btnObat27.setText("");
            btnObat28.setText("");
            btnObat29.setText("");
            btnObat30.setText("");
            btnObat31.setText("");
            btnObat32.setText("");
            btnObat33.setText("");
            btnObat34.setText("");
            btnObat35.setText("");
            btnObat36.setText("");
            btnObat37.setText("");
            btnObat38.setText("");
            btnObat39.setText("");
            btnObat40.setText("");
            btnObat41.setText("");
            btnObat42.setText("");
            btnObat43.setText("");
            btnObat44.setText("");
            btnObat45.setText("");
            btnObat46.setText("");
            btnObat47.setText("");
            btnObat48.setText("");
            btnObat49.setText("");
            btnObat50.setText("");
            btnObat51.setText("");
            btnObat52.setText("");
            btnObat53.setText("");
            btnObat54.setText("");
            btnObat55.setText("");

        }

        @FXML
        void btnonactionZ (ActionEvent event){
            lblDeskripsiObat.setText("");
            lblKosong.setText("");
            btnObat1.setText("Zinc Sulfat");
            btnObat2.setText("Zolpidem");
            btnObat3.setText("");
            btnObat4.setText("");
            btnObat5.setText("");
            btnObat6.setText("");
            btnObat7.setText("");
            btnObat8.setText("");
            btnObat9.setText("");
            btnObat10.setText("");
            btnObat11.setText("");
            btnObat12.setText("");
            btnObat13.setText("");
            btnObat14.setText("");
            btnObat15.setText("");
            btnObat16.setText("");
            btnObat17.setText("");
            btnObat18.setText("");
            btnObat19.setText("");
            btnObat20.setText("");
            btnObat21.setText("");
            btnObat22.setText("");
            btnObat23.setText("");
            btnObat24.setText("");
            btnObat25.setText("");
            btnObat26.setText("");
            btnObat27.setText("");
            btnObat28.setText("");
            btnObat29.setText("");
            btnObat30.setText("");
            btnObat31.setText("");
            btnObat32.setText("");
            btnObat33.setText("");
            btnObat34.setText("");
            btnObat35.setText("");
            btnObat36.setText("");
            btnObat37.setText("");
            btnObat38.setText("");
            btnObat39.setText("");
            btnObat40.setText("");
            btnObat41.setText("");
            btnObat42.setText("");
            btnObat43.setText("");
            btnObat44.setText("");
            btnObat45.setText("");
            btnObat46.setText("");
            btnObat47.setText("");
            btnObat48.setText("");
            btnObat49.setText("");
            btnObat50.setText("");
            btnObat51.setText("");
            btnObat52.setText("");
            btnObat53.setText("");
            btnObat54.setText("");
            btnObat55.setText("");

        }


    @FXML
     void btnonactionObat1(ActionEvent event) {
        if (btnObat1.getText().equals("Acarbose")) {
            lblDeskripsiObat.setText("Obat ini adalah salah satu dari banyak golongan obat untuk pengobatan diabetes melitus (DM) tipe 2." + "\n" +
                    "Namun acarbose hanya diberikan pada penderita diabetes mellitus yang sudah tidak bisa diterapi dengan" + "\n" +
                    "obatantidiabetes yang diminum lainnya. Obat acarbose bekerja dalam tubuh kita dengan cara menghambat" + "\n" +
                    "perubahan sukrosa menjadi glukosa dan fruktosa. Dengan begitu, kadar gula dalam darah bisa lebih terkontrol.");
        } else if (btnObat1.getText().equals("Bacitracin")) {
            lblDeskripsiObat.setText("Bacitracin yang dijual di pasaran memiliki berbagai jenis, bisa dalam bentuk oles maupun cairan injeksi, " + "\n" +
                    "menyesuaikan kebutuhan pasien. Untuk mencegah infeksi pada kulit yang terluka, tergores, dan terbakar, maka " + "\n" +
                    "obat yang diberikan dalam bentuk oles. Bacitracin akan menghambat dinding sel bakteri sintesis, dengan cara " + "\n" +
                    "mencegah perpindahan mukopeptida ke dalam dinding sel yang sedang tumbuh. Bacitracin juga merusak membran plasma " + "\n" +
                    "bakteri dan aktif melawan protoplasma.");
        } else if (btnObat1.getText().equals("Calcitriol")) {
            lblDeskripsiObat.setText("Calcitriol adalah obat yang digunakan untuk mengobati hiperparatiroidisme, sebuah kondisi ketika kelenjar" + "\n" +
                    "paratiroid mengeluarkan hormon paratiroid yang jumlahnya lebih banyak dari normal. Obat ini juga digunakan" + "\n" +
                    "untuk mengobati gangguan metabolisme tulang pada orang yang menderita gagal ginjal kronis dan tidak menerima" + "\n" +
                    "pengobatan dialisis.Calcitriol adalah vitamin D3. Vitamin D penting dalam proses absorpsi kalsium dari saluran" + "\n" +
                    "cerna serta mengaktifkan kalsium dalam tubuh.");
        } else if (btnObat1.getText().equals("Dabigatran")) {
            lblDeskripsiObat.setText("Dabigatran merupakan antikoagulan yang bekerja dengan menghambat penggumpalan darah. " + "\n" +
                    "Dabigatran digunakan untuk mengatasi penggumpalan darah dan mengurangi risiko stroke pada beberapa penderita gangguan ritme jantung.");
        } else if (btnObat1.getText().equals("Enalapril")) {
            lblDeskripsiObat.setText("Enalapril adalah Salah satu obat yang disarankan untuk mengobati tekanan darah tinggi. " + "\n" +
                    "Selain dapat mengobati tekanan darah tinggi, enalapril juga dapat digunakan untuk mengobati gagal jantung " + "\n" +
                    "kongestif (kegagalan jantung dalam memompa pasokan darah yang dibutuhkan tubuh) serta mengatasi gangguan ventrikel pada jantung.");
        } else if (btnObat1.getText().equals("Famotidine")) {
            lblDeskripsiObat.setText("Famotadine adalah salah satu obat untuk mengobati luka lambung. Obat ini juga dapat " + "\n" +
                    "digunakan untuk gangguan atau penyakit pada lambung lainnya, seperti kondisi di mana lambung terlalu " + "\n" +
                    "banyak memproduksi asam lambing seperti pada penyakit sindrom Zollinger-Ellison. Selain itu, famotidine " + "\n" +
                    "juga dapat mengobati GERD (reflusk asam lambung) yaotu kondisi di mana asam lambung naik ke kerongkongan " + "\n" +
                    "dan menyebabkan gejala berupa rasa terbakar pada dada.");
        } else if (btnObat1.getText().equals("Gabapentin")) {
            lblDeskripsiObat.setText("Obat gabapentin digunakan pada orang dewasa untuk mengobati nyeri neuropatik (nyeri akibat" + "\n" +
                    "kerusakan jaringan saraf), yang disebabkan oleh virus herpes atau shingles (herpes zoster). Obat ini juga" + "\n" +
                    "dapat digunakan untuk mengobati kejang pada pasien dewasa dan anak-anak dengan usia minimal 3 tahun.");
        } else if (btnObat1.getText().equals("Haloperidol")) {
            lblDeskripsiObat.setText("Kondisi permasalahan psikologis seperti schizofrenia memang bukanlah kondisi yang dapat " + "\n" +
                    "disembuhkan. Namun, dengan penanganan dan pemberian obat yang tepat, gejala-gejala pada kondisi schizofrenia" + "\n" +
                    "dapat lebih dikurangi. Salah satu obat yang biasa digunakan dalam terapi pengobatan schizofrenia adalah haloperidol.");
        } else if (btnObat1.getText().equals("Ibuprofen")) {
            lblDeskripsiObat.setText("Obat ibuprofen ini memang obat yang sering digunakan untuk mengurangi gejala demam dan mengobati " + "\n" +
                    "nyeri atau inflamasi yang disebabkan oleh berbagai kondisi seperti sakit kepala, sakit gigi, nyeri punggung, artritis " + "\n" +
                    "(peradangan pada sendi), kram saat haid, atau luka minor.");
        } else if (btnObat1.getText().equals("Kanamycin")) {
            lblDeskripsiObat.setText("Kanamycin adalah jenis obat yang digunakan untuk mengobati infeksi bakteri. " + "\n" +
                    "Kanamycin merupakan obat yang termasuk ke dalam antibiotik golongan aminoglikosida, yang bekerja" + "\n" +
                    "dengan cara melawan bakteri dalam tubuh.");
        } else if (btnObat1.getText().equals("L-Glutamine")) {
            lblDeskripsiObat.setText("Glutamine digunakan untuk mengobati kekurangan glutamine. Glutamine adalah suplemen gizi" + "\n" +
                    "yang mengandung asam amino l-alanyl dan l-glutamine yang digunakan sebagai nutrisi tambahan saat seseorang yang" + "\n" +
                    "membutuhkan tambahan glutamine, misalnya akibat kecelakaan atau penyakit.");
        } else if (btnObat1.getText().equals("Magnesium Hidroksida")) {
            lblDeskripsiObat.setText("Magnesium hidroksida digunakan sebagai obat pencahar (laksatif) untuk mengobati konstipasi" + "\n" +
                    "(ulit buang air besar) dan sebagai antasida untuk menghilangkan gangguan pencernaan, asam lambung, dan mulas.");
        } else if (btnObat1.getText().equals("Naltrexone")) {
            lblDeskripsiObat.setText("Naltrexone digunakan untuk mencegah kambuhnya seseorang yang memiliki ketergantungan pada " + "\n" +
                    "obat-obatan opioid dan telah berhenti menggunakannya. Naltrexone juga digunakan untuk mengobati alkoholisme " + "\n" +
                    "dengan mengurangi keinginan untuk minum alkohol.");
        } else if (btnObat1.getText().equals("Pantoprazole")) {
            lblDeskripsiObat.setText("Pantoprazole merupakan obat yang digunakan untuk mengobati peradangan kerongkongan dari asam" + "\n" +
                    " lambung akibat GERD, atau disebut juga dengan esofagitis korosif. Selain itu, obat ini juga digunakan untuk " + "\n" +
                    "mengobati sindrom Zollinger-Ellison. Sindrom Zollinger-Ellison merupakan kondisi yang jarang terjadi, yaitu " + "\n" +
                    "ketika satu atau lebih tumor terbentuk di pankreas atau bagian atas usus kecil (duodenum).");
        } else if (btnObat1.getText().equals("Quinidine")) {
            lblDeskripsiObat.setText("Quinidine adalah obat yang digunakan untuk menjaga detak jantung tetap normal terutama bagi " + "\n" +
                    "Kamu yang memiliki kelainan ritme jantung.");
        } else if (btnObat1.getText().equals("Radium")) {
            lblDeskripsiObat.setText("Radium merupakan obat yang digunakan untuk mengatasi kanker prostat yang sudah menyebar ke tulang " + "\n" +
                    "Radium atau yang dikenal dengan Ra 223 dichloride bekerja dengan cara menyerang sel kanker yang ada di tulang.");
        } else if (btnObat1.getText().equals("Saccharomyces boulardii Iyo")) {
            lblDeskripsiObat.setText("Saccharomyces boulardii Iyo adalah mikroorganisme berbentuk khamir, yang beguna secara efektif " + "\n" +
                    "untuk mencegah diare karena menggunakan antibiotik. Saccharomyces boulardii Iyo juga digunakan untuk mengobati diare " + "\n" +
                    "pada bayi dan anak-anak. Ini juga efektif menurunkan frekuensi diare akibat Clostridium difficile, diare pada pasien " + "\n" +
                    "HIV, serta luka di perut akibat bakteri Helicobacter pylori.");
        } else if (btnObat1.getText().equals("Tadalafil")) {
            lblDeskripsiObat.setText("Tadalafil digunakan untuk mengobati disfungsi ereksi. Disfungsi ereksi sendiri adalah kondisi ketika" + "\n" +
                    "penis tidak bisa mengeras dan memanjang, atau tidak bisa mempertahankan kekerasan ereksi untuk dapat melakukan penetrasi." + "\n" +
                    "Ketika pria terangsang atau terstimulasi secara seksual, respons normal tubuh adalah meningkatkan aliran darah ke " + "\n" +
                    "penis sehingga penis menegang. Dengan enzim dikontrol oleh tadalafil, maka ereksi dapat dipertahankan. Namun tanpa " + "\n" +
                    "stimulasi fisik pada penis, tadalafil tidak akan bisa menciptakan ereksi.");
        } else if (btnObat1.getText().equals("Vaksin BCG")) {
            lblDeskripsiObat.setText("Bacillus Calmette and Guérin atau BCG adalah vaksin yang digunakan untuk mencegah tuberkulosis. " + "\n" +
                    "Vaksin ini dapat diberikan pada bayi baru lahir, anak kecil, dan orang dewasa. Namun, semua anak berusia 6 tahun " + "\n" +
                    "atau lebih direkomendasikan untuk melakukan skin test terlebih dahulu sebelum menerima vaksin BCG. Tes ini dilakukan " + "\n" +
                    "untuk melihat apakah ada reaksi alergi terhadap tuberkuloprotein");
        } else if (btnObat1.getText().equals("Warfarin")) {
            lblDeskripsiObat.setText("Warfarin adalah obat yang digunakan untuk mengatasi dan mencegah penggumpalan darah pada pembuluh" + "\n" +
                    "darah vena maupun arteri. Obat ini juga dapat menurunkan risiko stroke, serangan jantung, dan kondisi serius lainnya" + "\n" +
                    "akibat penyumbatan bekuan darah di arteri.");
        } else if (btnObat1.getText().equals("Zinc Sulfat")) {
            lblDeskripsiObat.setText("Zink sulfat adalah obat yang digunakan untuk mengatasi dan mencegah kekurangan zinc. Tubuh " + "\n" +
                    "membutuhkan zinc untuk mendukung kesehatan secara umum. Umumnya, zinc sulfat diberikan dalam bentuk diminum. " + "\n" +
                    "Namun, ada juga pasien yang menerima lewat jalur intravena.");
        }
    }



    @FXML
     void btnonactionObat2(ActionEvent event) {
        if (btnObat2.getText().equals("Acetazolamide")){
            lblDeskripsiObat.setText("Obat ini bekerja dengan mengurangi jumlah cairan yang dapat menumpuk di bola mata dan menyebabkan ketegangan" +"\n"+
                    "di bola mata, sebagai penyebab glukoma. Tidak hanya di mata, penumpukan cairan di tubuh (bengkak/edema) akibat penyakit gagal" +"\n"+
                    "jantung kongestif atau pengaruh obat-obatan tertentu juga bisa diterapi dengan acetazolamide. Cara kerja obat ini ialah dengan" +"\n"+
                    "meningkatkan pengeluaran air dari tubuh melalui ginjal sehingga dapat menurunkan tekanan pada bola mata dan mengempiskan badan" +"\n"+
                    "yang bengkak karena penumpukan cairan.");
        }else if (btnObat2.getText().equals("Baclofen")){
            lblDeskripsiObat.setText("Baclofen digunakan untuk mengobati kejang, nyeri, dan kaku otot yang disebabkan oleh penyakit multiple sklerosis." +"\n"+
                    "Ini merupakan penyakit autoimun yang menyerang sistem saraf pusat, terutama otak, saraf tulang belakang, dan saraf mata. Baclofen" +"\n"+
                    "bekerja dengan cara membuat otot menjadi lebih rileks.");
        }else if (btnObat2.getText().equals("Calcium Acetate")){
            lblDeskripsiObat.setText("Calcium acetate adalah obat yang digunakan oleh penderita gagal ginjal, untuk mengontrol kadar fosfat dalam darah" +"\n"+
                    "agar tidak terlalu tinggi. Calcium merupakan mineral yang dibutuhkan untuk mengatur beberapa fungsi tubuh, terutama untuk pembentukan" +"\n"+
                    "dan mempertahankan kepadatan tulang. Calcium dapat mengikat mineral lain seperti fosfat dan membantu pengeluaran ion fosfat dari dalam tubuh.");
        }else if (btnObat2.getText().equals("Desloratadine")){
            lblDeskripsiObat.setText("Desloratadine adalah obat yang digunakan untuk mengobati gejala alergi, seperti bersin-bersin, mata berair, hidung berair." +"\n"+
                    "Obat ini juga digunakan untuk mengobati bentol-bentol dan gatal-gatal di kulit bagi Kamu yang memiliki reaksi alergi kulit kronis. ");
        }else if (btnObat2.getText().equals("Eperisone")){
            lblDeskripsiObat.setText("Eperisone adalah pelemas otot, bekerja dengan cara melemaskan otot skeletal atau otot rangka sehingga Kamu bisa bergerak dengan " +"\n"+
                    "lebih leluasa lagi. Selain dapat melemaskan otot dan meregangkan kembali otot yang kaku, eperisone juga memiliki beberapa efek samping yang " +"\n"+
                    "perlu diperhatikan seperti rasa lelah, pening, insomnia, rasa kantuk berlebih, mati rasa atau gemetar pada ujung-ujung jari tangan atau kaki, " +"\n"+
                    "gangguan fungsi ginjal dan hati, perubahan pada darah, kulit kemerahan, gatal-gatal, gangguan pencernaan, gangguan berkemih.");
        }else if (btnObat2.getText().equals("Felodipine")) {
            lblDeskripsiObat.setText("Felodipine digunakan untuk mengatasi tekanan darah tinggi atau hipertensi. Felodipine merupakan obat antihipertensi golongan CCB" +"\n"+
                    "(Calsium Channel Blokers) yang bekerja dengan melemaskan otot jantung dan pembuluh darah sehingga tekanan darah dapat turun.");
        }else if (btnObat2.getText().equals("Galantamine")){
            lblDeskripsiObat.setText("Obat galantamine dapat digunakan untuk mengobati demensia yang disebabkan oleh penyakit alzheimer. Saat digunakan, galantamine akan " +"\n"+
                    "meningkatkan fungsi sel saraf pada otak. Pasien yang mengalami demensia memiliki kadar asetilkolin yang rendah. Asetilkolin penting untuk proses " +"\n"+
                    "mengingat, berpikir, dan berargumen. Nah, obat ini bekerja dengan cara mencegah pemecahan senyawa kimia asetilkolin. ");

        }else if (btnObat2.getText().equals("Heparin")){
            lblDeskripsiObat.setText("Heparin adalah obat yang digunakan untuk mencegah penggumpalan darah akibat penyakit tertentu atau prosedur medis tertentu misalnya " +"\n"+
                    "operasi. Heparin merupakan obat dalam kelompok antikoagulan, atau anti penggumpalan darah. Bekerja dengan memengaruhi proses pembekuan darah di dalam " +"\n"+
                    "tubuh sehingga tidak sampai terjadi bekuan darah.");
        }else if (btnObat2.getText().equals("Iloprost")){
            lblDeskripsiObat.setText("Iloprost merupakan obat yang digunakan untuk mengobati penyakit pulmonary arterial hypertension atau hipertensi paru, yaitu tekanan" +"\n"+
                    "darah tinggi pada pembuluh darah arteri dari jantung ke paru-paru. Iloprost merupakan jenis obat dari golongan prostasiklin sintetik" +"\n"+
                    "yang bekerja dengan cara melebarkan pembuluh darah di paru-paru, sehingga tekanan darah di paru bisa diturunkan.");
        }else if (btnObat2.getText().equals("Kaolin")){
            lblDeskripsiObat.setText("Kaolin merupakan jenis obat antidiare adsorbent yang bekerja dengan cara mengikat dan memerangkap bakteri beserta racunnya di dalam" +"\n"+
                    "perut. Kaolin juga dapat mengikat air di dalam perut sehingga membuat feses menjadi lebih keras. Selain dapat mengatasi diare, kaolin" +"\n"+
                    "juga memiliki beberapa efek samping jika dikonsumsi, seperti gangguan elektolit akibat meningkatnya jumlah natrium dan kalium dalam feses.");
        }else if (btnObat2.getText().equals("Lactic Acid")){
            lblDeskripsiObat.setText("Lactic acid merupakan agen keratolitik yang dapat melembapkan kulit dengan cara melembutkan atau melarutkan zat tanduk (keratin)" +"\n"+
                    "yang melapisi bagian atas kulit. Hal tersebut membuat sel kulit mati terlepas dan membantu kulit untuk menyimpan air. Selain dapat" +"\n"+
                    "melembapkan kulit dan membuatnya terasa halus, asam laktat juga bisa menimbulkan beberapa efek samping seperti rasa terbakar ringan," +"\n"+
                    "rasa menyengat, kulit terkelupas.");
        }else if (btnObat2.getText().equals("Manitol")){
            lblDeskripsiObat.setText("Manitol digunakan untuk meningkatkan produksi urine bagi penderita gagal ginjal. Peningkatan produksi urine akan membantu ginjal" +"\n"+
                    "dari keadaan istirahat dan meningkatkan kecepatan pembuangan racun dari dalam tubuh. Manitol merupakan obat golongan diuretik." +"\n"+
                    "Manitol meningkatkan produksi urine dengan menghambat penyerapan kembali (reabsorpsi) air dan elektrolit. Manitol meningkatkan" +"\n"+
                    "tekanan osmotik pada plasma sehingga air akan keluar dari jaringan dan meningkatkan jumlah urine yang dikeluarkan tubuh.");
        } else if (btnObat2.getText().equals("Naproxen")) {
            lblDeskripsiObat.setText("Naproxen adalah obat antiinflamasi, atau antiradang di organ sendi dan tulang (muskuloskeletal). Maka obat ini dapat digunakan" +"\b"+
                    "untuk mengobati inflamasi yang ditandai nyeri dan bengkak terutama pada peradangan sendi (artritis), peradangan tulang belakang" +"\n"+
                    "(ankylosing spondylitis), peradangan tenson (tendinitis), peradangan pada bursa (bursitis), asam urat, dan kram akibat menstruasi." +"\n"+
                    "Naproxen merupakan obat golongan Non-Steroid Antiinflamation Drugs (NSAIDs). Obat bekerja dengan menurunkan pelepasan hormon yang" +"\n"+
                    "menyebabkan pembengkakan atau inflamasi dan rasa sakit pada tubuh.");

        }else if (btnObat2.getText().equals("Papaverine")) {
            lblDeskripsiObat.setText("Papaverine digunakan untuk mengobati berbagai kondisi yang menyebabkan spasme atau kejang otot polos, termasuk nyeri dada," +"\n"+
                    "masalah sirkulasi, serangan jantung, maupun gangguan perut atau kantong empedu. Papaverine adalah vasodilator yang melemaskan" +"\n"+
                    "dan melebarkan otot-otot polos di pembuluh darah. Papaverine menurunkan tekanan darah dan memungkinkan darah mengalir lebih" +"\n"+
                    "mudah melalui pembuluh darah vena dan arteri.");

        }else if (btnObat2.getText().equals("Quinine")) {
            lblDeskripsiObat.setText("Quinine dapat digunakan untuk mengobati malaria, namun untuk jenis penyakit malaria yang tidak disertai komplikasi. Quinine" +"\n"+
                    "tidak dapat digunakan untuk mengobati malaria yang parah dan sebaiknya tidak digunakan untuk mencegah malaria. Quinine bekerja" +"\n"+
                    "dengan cara melawan parasit penyebab malaria di dalam tubuh.");

        }else if (btnObat2.getText().equals("Ramipril")) {
            lblDeskripsiObat.setText("Ramipril merupakan obat antihipertensi yang digunakan untuk mengatasi tekanan darah yang tinggi (hipertensi) atau gagal jantung." +"\n"+
                    "Ramipril bekerja dengan cara menghambat ACE (angiotensin pengubah enzim) yang bertanggungjawab pada penyempitan pembuluh darah." +"\n"+
                    "Sehingga jika diberikan penghambat ACE, maka akan ada efek pelebaran pembuluh darah");

        }else if (btnObat2.getText().equals("Salbutamol")) {
            lblDeskripsiObat.setText("Salbutamol digunakan untuk mengobati asma (memperbaiki aliran pernapasan), bronkitis kronis, dan emfisema." +"\n"+
                    "Salbutamol bekerja sebagai obat antagonis beta-2, yakni akan melemaskan otot serta memperlancar saluran pernapasan dan rahim.");

        }else if (btnObat2.getText().equals("Tafluprost")) {
            lblDeskripsiObat.setText("Tafluprost adalah obat yang digunakan untuk tekanan tinggi di dalam mata akibat glaukoma atau jenis penyakit" +"\n"+
                    " mata lain seperti hipertensi okular. Menurunkan tekanan tinggi di dalam mata bisa membantu mencegah" +"\n"+
                    "kebutaan. Tafluprost bekerja dengan cara menurunkan tekanan pada mata. Obat ini meningkatkan jumlah" +"\n"+
                    "cairan dalam mata untuk mencegah mata kering");

        }else if (btnObat2.getText().equals("Valacyclovir")) {
            lblDeskripsiObat.setText("Valacyclovir adalah obat yang digunakan untuk mengobati infeksi yang disebabkan oleh beberapa jenis virus. Pada anak, obat" +"\n"+
                    "ini digunakan untuk mengatasi kelecetan di mulut yang disebabkan oleh herpes simpleks dan cacar air pada anak usia diatas 2 tahun." +"\n"+
                    "Pada orang dewasa, Valacyclovir digunakan untuk mengobati penyakit ruam saraf dan herpes di mulut. Obat ini juga digunakan untuk" +"\n"+
                    "mengobati herpes genital. Valacyclovir adalah obat antivirus. Obat ini memperlambat pertumbuhan sejumlah virus. Namun, valacylovir" +"\n"+
                    "tidak bisa mengobati infeksinya secara tuntas. Virus yang menyebabkan infeksi ini terus hidup di tubuh pasien, meskipun sedang tidak" +"\n"+
                    "kambuh. Obat ini hanya bekerja untuk meredakan dan mempercepat penyembuhan pada infeksi yang kembuh kembali.");

        }else if (btnObat2.getText().equals("White Petrolatum")) {
            lblDeskripsiObat.setText("White petrolatum digunakan untuk menutup luka dan pelembab/lubrikan pada mata. White petrolatum bekerja sebagai pelembap yang" +"\n"+
                    "mencegah penguapan air dari permukaan kulit dengan membuat lapisan berminyak pada permukaan kulit.");

        }else if (btnObat2.getText().equals("Zolpidem")) {
            lblDeskripsiObat.setText("Zolpidem adalah obat yang digunakan untuk mengatasi insomnia. Tablet zolpidem yang langsung dilepaskan akan membantu Kamu untuk" +"'\n"+
                    "tidur. Zolpidem merupakan jenis obat sedatif atau disebut juga hipnotik. Obat ini bekerja di sinyal kimia otak agar jumlahnya" +"\n"+
                    "seimbang dan dapat mengatasi masalah tidur.");

        }
    }
    @FXML
     void btnonactionObat3(ActionEvent event) {
        if (btnObat3.getText().equals("Acetylcysteine")){
            lblDeskripsiObat.setText("Obat ini juga diberikan pada pasien gangguan bronkopulmonalis akut dan kronis seperti pneumonia, bronkitis, emfisema," +"\n"+
                    "tracheobronchitis, bronkitis kronis asma, TBC, bronkiektasis, amiloidosis paru-paru primer, atelektasis (pengerutan jaringan paru)" +"\n"+
                    "yang disebabkan oleh penyumbatan lendir.");
        } else if (btnObat3.getText().equals("Bambuterol")) {
            lblDeskripsiObat.setText("Bambuterol adalah obat yang digunakan untuk mengobati asma serta penyumbatan pada saluran napas yang reversibel dan menetap.");
        }else if (btnObat3.getText().equals("Calcium Carbonate")){
            lblDeskripsiObat.setText("Kalsium adalah mineral penting yang dibutuhkan oleh tubuh, terutama untuk pertumbuhan dan pemeliharaan" + "\n"+
                    "gigi serta tulang. Tak hanya itu, kalsium juga dibutuhkan oleh saraf, jantung, dan sistem pembekuan darah agar bisa" + "\n"+
                    "berfungsi dengan baik.");
        }else if (btnObat3.getText().equals("Desoximetasone")){
            lblDeskripsiObat.setText("Desoximetasone digunakan untuk mengobati peradangan dan gatal-gatal yang disebabkan oleh beberapa " + "\n"+
                    "kondisi kulit, seperti reaksi alergi, eksim, dan psoriasis (peradangan pada kulit yang disebabkan oleh autoimun).");
        }else if (btnObat3.getText().equals("Ephedrine")){
            lblDeskripsiObat.setText("Ephedrine adalah obat yang digunakan untuk sesak napas. Diberikan untuk mengurangi masalah pernapasan " + "\n"+
                    "seperti gejala nafas pendek-pendek, dada terasa sesak, dan bersin-bersin yang disebabkan oleh asma bronkial.");
        }else if (btnObat3.getText().equals("Fenofibrate")){
            lblDeskripsiObat.setText("Kadar kolesterol yang tinggi dalam tubuh bisa meningkatkan risiko timbulnya sejumlah masalah kesehatan, seperti stroke " +"\n"+
                    "dan penyakit jantung koroner. Maka dari itu, diperlukan konsumsi obat fenofibrate, yang dapat menurunkan kadar kolesterol " +"\n"+
                    "serta trigliserida (asam lemak) dalam tubuh. Fenofibrate bekerja dengan cara mengurangi kadar kolestrol dan trigliserida " +"\n"+
                    "dalam darah. Apabila kadar jenis lemak tersebut tinggi dalam darah, maka dapat memicu terjadinya peningkatan risiko " +"\n"+
                    "atherosclerosis (tersumbatnya arteri).");
        }
        else if (btnObat3.getText().equals("Gemfibrozil")){
            lblDeskripsiObat.setText("Kadar kolesterol dan trigliserida yang tinggi dalam darah dapat berbahaya bagi kesehatan. Untuk itu," + "\n"+
                    "penting agar setiap orang, terutama penderita pankreatitis (peradangan pada pankreas), untuk selalu menjaga kadar" + "\n"+
                    "kolesterol dan trigliserida.");
        }else if (btnObat3.getText().equals("Homochlorcyclizine dihydrochloride")){
            lblDeskripsiObat.setText("Homochlorcyclizine dihydrochloride merupakan golongan obat antihistamin. Obat ini bekerja dengan cara" + "\n"+
                    "menurunkan efek dari zat histamin dalam tubuh. Histamin merupakan zat yang menyebabkan gejala alergi seperti bersin," + "\n"+
                    "gatal, mata berair, hidung berair dan gejala alergi lainnya.");
        }else if (btnObat3.getText().equals("Imipramine")){
            lblDeskripsiObat.setText("Imipramine adalah obat yang digunakan untuk mengatasi gangguan depresi, mencegah anak-anak yang masih " +"\n"+
                    "mengompol atau gejala lainnya. mipramine bekerja dengan cara mempengaruhi hormon serotonin dan norepinefrin. Hormon tersebut " +"\n"+
                    "yang mengatur mood dan suasana hati.");
        }else if (btnObat3.getText().equals("Ketamine")){
            lblDeskripsiObat.setText("Ketamine adalah obat yang digunakan untuk membuat pasien tidak sadar saat operasi, sehingga dapat mencegah " +"\n"+
                    "timbulnya rasa sakit dan tidak nyaman saat dilakukan prosedur medis. Ketamine merupakan obat anestesi yang bekerja dengan cara " +"\n"+
                    "memengaruhi senyawa kimia tertentu di otak yang dapat menimbulkan rasa sakit serta membuat kesadaran pasien menurun.");
        }else if (btnObat3.getText().equals("Lactobacillus Acidophilus")){
            lblDeskripsiObat.setText("Lactobacillus acidophilus adalah obat yang digunakan untuk mencegah infeksi ragi pada vagina dan mulut, diare yang" +"\n"+
                    "disebabkan oleh penggunaan antibiotik, serta infeksi pada saluran kemih. Lactobacillus acidophilus merupakan bakteri yang secara alami " +"\n"+
                    "terdapat di tubuh, terutama di bagian usus dan vagina");
        }else if (btnObat3.getText().equals("Mebhydrolin")){
            lblDeskripsiObat.setText("Mebhydrolin digunakan untuk meredakan gejala alergi seperti gatal, ruam pada kulit, bersin-bersin, bintik-bintik merah pada " +"\n"+
                    "kulit, dan hidung berair. Mebhydrolin merupakan obat golongan antihistamin dengan antimuskarinik dan efek sedatif (mengantuk). ");
        }else if (btnObat3.getText().equals("Nateglinide")){
            lblDeskripsiObat.setText("Nateglinide merupakan obat diabetes yang digunakan untuk mengontrol kadar gula darah yang tinggi." +"\n"+
                    "Dokter biasanya menganjurkan penderita diabetes untuk tetap menjaga pola makan yang baik dan berolahraga" +"\n"+
                    "saat memberikan obat ini. Obat ini secara khusus digunakan untuk mengobati diabetes tipe 2.");
        }else if (btnObat3.getText().equals("Paracetamol")){
            lblDeskripsiObat.setText("Parasetamol digunakan untuk mengobati banyak kondisi, seperti sakit kepala, nyeri otot, radang sendi," +"\n"+
                    "sakit punggung, sakit gigi, pilek, dan demam. Parasetamol mengurangi rasa sakit pada radang sendi ringan" +"\n"+
                    "tetapi tidak berpengaruh pada peradangan dan pembengkakan sendi yang berat.");
        }else if (btnObat3.getText().equals("Ranitidin")){
            lblDeskripsiObat.setText("Ranitidin merupakan obat yang digunakan untuk mengobati dan mencegah luka pada lambung dan usus. Obat ini juga dapat digunakan " +"\n"+
                    "apabila lambung memproduksi asam berlebihan seperti pada sindrom Zollinger-Ellison. Ranitidin dapat mengatasi GERD yakni kondisi" +"\n"+
                    "dimana asam dari lambung naik ke esofagus. Ranitidin bekerja dengan menghambat produksi histamin 2 sehingga mengurangi produksi" +"\n"+
                    "jumlah asam dalam lambung.");
        }else if (btnObat3.getText().equals("Salmeterol")){
            lblDeskripsiObat.setText("Salmeterol digunakan untuk mencegah serangan asma atau bronkospasme akibat berolahraga. Salmeterol juga digunakan untuk mengobati " +"\n"+
                    "penyakit COPD, emfisema, dan bronkitis kronis. Salmeterol merupakan bronkodilator yang bekerja merelaksasikan otot saat sesak" +"\n"+
                    "napas, sehingga dapat memperlancar saluran pernapasan.");
        }else if (btnObat3.getText().equals("Tamoxifen")){
            lblDeskripsiObat.setText("amoxifen adalah obat yang digunakan untuk mengobati beberapa jenis kanker payudara, termasuk yang sudah menyebar ke organ lain " +"\n"+
                    "(kanker payudara metastatik). Obat ini juga digunakan untuk pasien kanker payudara yang baru selesai menjalani operasi dan" +"\n"+
                    "terapi radiasi. Tamoxifen bekerja dengan cara memblokir atau mencegah dampak estrogen di jaringan payudara.");
        }else if (btnObat3.getText().equals("Valsartan")){
            lblDeskripsiObat.setText("Valsartan adalah obat tekanan darah tinggi atau antihipertensi yang bisa diberikan pada dewasa maupun anak berusia 6 tahun atau" +"\n"+
                    "lebih. Konsumsi obat ini biasanya dikombinasikan dengan obat lain. Valsartan juga dapat mengatasi gagal jantung dan menurunkan" +"\n"+
                    "risiko kematian setelah mengalami serangan jantung. Valsartan termasuk obat antihipertensi golongan ARB (angiotensin reseptor bloker).");
        }

    }

    @FXML
     void btnonactionObat4(ActionEvent event) {
        if (btnObat4.getText().equals("Acrivastine")){
            lblDeskripsiObat.setText("Acrivastine adalah obat yang digunakan untuk mengatasi rhinitis akibat perubahan musim. Selain itu, obat ini juga digunakan untuk" +"\n"+
                    "mengobati idiopati urtikaria kronis. Acrivastine termasuk obat antihistamin dan antialergi. Obat ini bekerja dengan cara mengatasi" +"\n"+
                    "reaksi alergi yang muncul dalam tubuh.");
        }else if (btnObat4.getText().equals("Benazepril")){
            lblDeskripsiObat.setText("Benazepril adalah obat yang digunakan untuk mengatasi tekanan darah tinggi (hipertensi). Menurunkan tekanan darah dapat membantu" +"\n"+
                    "mencegah stroke, serangan jantung, dan masalah ginjal. Benazepril termasuk obat golongan ACEI. Obat ini bekerja dengan" +"\n"+
                    "menurunkan kontraksi otot pembuluh darah, sehingga tekanan darah menurun. ");
        }else if (btnObat4.getText().equals("Candesartan")){
            lblDeskripsiObat.setText("Candesartan adalah obat yang digunakan untuk mengobati tekanan darah tinggi pada orang dewasa dan anak-anak yang berusia minimal 1 tahun." +"\n"+
                    "Obat ini juga bisa digunakan pada orang dewasa yang menderita sejumlah tipe penyakit jantung, serta untuk mengurangi" +"\n"+
                    "komplikasi serius atau kematian akibat kerusakan jantung. Candesartan adalah sejenis reseptor antagonis angiotensin II.");
        }else if (btnObat4.getText().equals("Dexamethasone")){
            lblDeskripsiObat.setText("Dexamethasone adalah golongan steroid yang digunakan untuk mengobati berbagai kondisi seperti alergi, kondisi kulit, radang usus besar," +"\n"+
                    "peradangan sendi, lupus, psoriasis (gangguan kulit akibat autoimun), atau gangguan pernapasan. Dexamethasone bekerja dengan cara" +"\n"+
                    "mencegah pelepasan senyawa dalam tubuh yang menyebabkan peradangan.");
        }else if (btnObat4.getText().equals("Epinephrine")){
            lblDeskripsiObat.setText("Ephinephrine merupakan senyawa kimia yang bekerja dengan cara menyempitkan pembuluh darah dan membuka saluran napas pada paru-paru, sehingga" +"\n"+
                    "dapat mengatasi penurunan tekanan darah, bersin-bersin, gatal-gatal yang parah, bentol-bentol, dan gejala alergi lain.");
        }else if (btnObat4.getText().equals("Fentanyl")){
            lblDeskripsiObat.setText("Fentanyl merupakan jenis obat analgesik golongan opioid poten, yang bekerja dengan cara meningkatkan ambang rasa nyeri. Selain" +
                    "dapat mengurangi rasa nyeri yang dialami setelah menjalani operasi atau prosedur medis lain, fentanyl ternyata juga memiliki beberapa efek samping" +"\n"+
                    "yang umum terjadi, seperti demam, penurunan fungsi pernapasan, mual, muntah, diaforesis (keringat berlebihan), dan hipoventilasi" +"\n"+
                    "(napas terlalu pendek atau lambat).");
        }else if (btnObat4.getText().equals("Gentamicin")){
            lblDeskripsiObat.setText("Gentacimin merupakan jenis antibiotik yang bekerja dengan cara melawan dan menghentikan pertumbuhan bakteri. Selain dapat mengatasi infeksi" +"\n"+
                    "bakteri, penggunaan gentacimin juga dapat menimbulkan beberapa efek samping, seperti kram perut atau sakit perut, gelisah, nyeri" +"\n"+
                    "punggung, feses berwarna hitam, darah pada urine, pandangan kabur atau ganda, nyeri dada, menggigil, koma, kebingungan, batuk," +"\n"+
                    "nyeri pada mata, mulut kering, detak jantung cepat, halusinasi, serta demam yang disertai ataupun tidak disertai menggigil.");
        }else if (btnObat4.getText().equals("Human Chorionic Gonadotropin")){
            lblDeskripsiObat.setText("HCG merupakan hormon penting untuk membantu mematangkan sel telur pada ovarium dan menstimulasi pelepasan telur saat ovulasi. Jika telur tidak" +"\n"+
                    "matang dan tidak terjadi ovulasi, maka tidak dapat terjadi pembuahan dan kehamilan sulit terjadi. HCG digunakan untuk terapi" +"\n"+
                    "kesuburan di antaranya untuk memperbaiki kesuburan pada wanita dan meningkatkan jumlah sperma pada pria. Selain itu, HCG juga" +"\n"+
                    "dapat digunakan pada anak laki-laki untuk membantu testikel turun ke skrotum secara normal.");
        }else if (btnObat4.getText().equals("Indinavir")){
            lblDeskripsiObat.setText("Indinavir dapat mengurangi penyebaran infeksi virus HIV di dalam sel-sel dalam tubuh, sehingga kekebalan atau imunitas tubuh yang menjadi sasaran" +"\n"+
                    "virus ini dapat dipertahankan fungsinya. Indinavir merupakan ARV arau antivirus yang bekerja dengan cara menghambat perkembangan" +"\n"+
                    "virus HIV agar jumlahnya dapat ditekan serendah mungkin di dalam tubuh.");
        }else if (btnObat4.getText().equals("Ketoconazole")){
            lblDeskripsiObat.setText("Ketoconazole merupakan obat antijamur. Namun dalam penggunaannya, ketoconazole tidak dapat mengobati infeksi jamur pada jari kuku tangan dan kaki." +"\n"+
                    "Obat ini juga sebaiknya hanya digunakan ketika obat antijamur lain sudah tidak dapat digunakan. Ketoconazole merupakan obat antifungi" +"\n"+
                    "yang bekerja dengan cara melawan infeksi yang disebabkan oleh jamur.");
        }else if (btnObat4.getText().equals("Lactobacillus acidophilus")){
            lblDeskripsiObat.setText("Lactobacillus acidophilus adalah produk yang digunakan untuk mencegah infeksi jamur ragi pada vagina, infeksi ragi pada mulut, diare yang disebabkan" +"\n"+
                    "oleh penggunaan antibiotik, dan infeksi pada saluran kencing. Lactobacillus Acidophilus sebenarnya merupakan bakteri yang secara alamiah" +"\n"+
                    "terdapat pada tubuh, terutama pada usus dan vagina. Bakteri ini membantu mempertahankan lingkungan asam pada tubuh yang berfungsi untuk" +"\n"+
                    "mencegah pertumbuhan bakteri jahat.");
        }else if (btnObat4.getText().equals("Meloxicam")){
            lblDeskripsiObat.setText("arthritis (peradangan sendi) dan osteoarthritis (pengapuran sendi) pada orang dewasa. Meloxicam juga dapat digunakan untuk mengobati juvenile" +"\n"+
                    "rheumatoid arthritis pada anak-anak yang berusia minimal 2 tahun. Meloxicam adalah obat antinyeri dan anti peradangan dari golongan" +"\n"+
                    "anti-inflamasi nonsteroid (NSAID). Meloksicam bekerja dengan mengurangi hormon yang menyebabkan peradangan dan rasa sakit di tubuh");
        }else if (btnObat4.getText().equals("Natrium Bikarbonat")){
            lblDeskripsiObat.setText("Natrium bikarbonat digunakan untuk mengobati gangguan pada saluran pencernaan yang menimbulkan rasa nyeri pada bagian atas perut (indigestion)." +"\n"+
                    "Obat ini juga digunakan untuk mengurangi rasa tidak nyaman atau nyeri di dada yang disebabkan oleh asam lambung yang naik kembali" +"\n"+
                    "ke kerongkongan (heart burn). atrium bikarbonat merupakan antasida yang bekerja dengan menetralkan asam lambung.");
        }else if (btnObat4.getText().equals("Parecoxib")){
            lblDeskripsiObat.setText("Parecoxib merupakan obat antinyeri. Obat ini bekerja dengan mengurangi produksi zat yang menyebabkan rasa nyeri, inflamasi, dan pembengkakan. ");
        }else if (btnObat4.getText().equals("Ranolazine")){
            lblDeskripsiObat.setText("Ranolazine merupakan obat yang digunakan untuk mengatasi angina kronis (nyeri dada), salah satu gejala serangan jantung. Obat ini tidak" +"\n"+
                    "digunakan untuk serangan angina atau angina akut. Ranolazine bekerja dengan cara meningkatkan aliran darah untuk membantu jantung" +"\n"+
                    "agar bekerja lebih efektif.");
        }else if (btnObat4.getText().equals("Satranidazole")){
            lblDeskripsiObat.setText("Satranidazole digunakan untuk abses atau adanya nanah di liver akibat infeksi amuba, penyakit giardiasis dan trichomoniasis. Satranidazole bekerja" +"\n"+
                    "sebagai antiamuba, yakni mengobati penyakit yang diakibatkan oleh parasit bersel tunggal protozoa");
        }else if (btnObat4.getText().equals("Tamsulosin")){
            lblDeskripsiObat.setText("Tamsulosin adalah obat yang digunakan untuk mengobati pria yang mengalami pembesaran kelenjar prostat atau biasa disebut pembesaran prostat jinak." +"\n"+
                    "Pembesaran prostat jinak biasanya menyerang pria yang sudah memasuki usia lanjut. Tamsulosin termasuk ke dalam golongan obat alpha" +"\n"+
                    "blockers. Obat ini berfungsi merelaksasi otot di prostat dan pintu kandung kemih. Hal ini membantu meningkatkan kelancaran urine" +"\n"+
                    "dan meredakan gejalanya.");
        }else if (btnObat4.getText().equals("Vancomycin")){
            lblDeskripsiObat.setText("Vancomycin merupakan antibiotik yang digunakan untuk mengobati infeksi usus akibat bakteri Clostridium difficile. Bakteri ini bisa menyebabkan" +"\n"+
                    "diare berair atau berdarah. Obat ini efektif untuk infeksi yang disebabkan bakteri Staphylococcus di mana bakteri menghasilkan" +"\n"+
                    "racun yang menyebabkan");
        }

    }

    @FXML
     void btnonactionObat5(ActionEvent event) {
        if (btnObat5.getText().equals("Acyclover Topical")){
            lblDeskripsiObat.setText("Aciclovir bekerja dengan cara menghambat sintesis DNA virus dan mencegah virus berkembang biak atau memperbanyak diri. ketika salep dioleskan" +"\n"+
                    "pada kulit yang terkena herpes, bisa timbul rasa menyengat pada kulit, rasa terbakar, gatal, kulit kemerahan");
        }else if (btnObat5.getText().equals("Benzoyl Peroxide")){
            lblDeskripsiObat.setText("enzoyl peroxide digunakan untuk obat jerawat dan mengobati decubitus atau stasis ulser, jaringan mati pada daerah kulit yang diberikan " +"\n"+
                    "ekanan terus-menerus sebagai akibat duduk terlalu lama, koma, atau imobilitas. Benzoyl peroxide memiliki efek antibakteri." +"\n"+
                    "Selain itu, obat ini memiliki efek mengeringkan sedang pada wajah, sehingga minyak dan kotoran berlebih pada wajah mudah" +"\n"+
                    "ntuk dibersihkan.");
        }else if (btnObat5.getText().equals("Captopril")){
            lblDeskripsiObat.setText("Captopril adalah obat yang digunakan untuk mengatasi tekanan darah tinggi, gagal jantung kongestif (kegagalan jantung dalam memompa darah yang" +"\n"+
                    "dibutuhkan tubuh), gangguan ginjal akibat diabetes, serta meningkatkan harapan dan kualitas hidup penderita serangan jantung." +"\n"+
                    "Captopril adalah salah satu obat golongan ACE inhibitor, yang bekerja dengan cara merelaksasi pembuluh darah, sehingga darah" +"\n"+
                    "dapat mengalir dengan lebih lancar.");
        }else if (btnObat5.getText().equals("Dexchlorpheniramine")){
            lblDeskripsiObat.setText("Dexchlorpheniramine adalah obat yang digunakan untuk mengatasi alergi. Dexchlorpheniramine merupakan antihistamin yang bekerja dengan menurunkan" +"\n"+
                    "efek dari zat histamin dalam tubuh. Histamin merupakan zat yang menyebabkan gejala bersin, gatal, mata berair, hidung berair" +"\n"+
                    "dan gejala alergi lainnya.");
        }else if (btnObat5.getText().equals("Erdosteine")){
            lblDeskripsiObat.setText("Endorsteine adalah obat digunakan untuk mengatasi perburukan tiba-tiba dari penyakit bronkitis kronis. Erdosteine bekerja dengan cara mengencerkan" +"\n"+
                    "dahak yang timbul saat seseorang mengalami bronkitis kronis.");
        }else if (btnObat5.getText().equals("Ferrous Fumarate")){
            lblDeskripsiObat.setText("Ferrous fumarate adalah obat atau suplemen yang digunakan untuk mengobati anemia (kekurangan sel darah merah), akibat kekurangan zat besi dalam" +"\n"+
                    "tubuh. Ferrous fumarate adalah obat atau suplemen yang digunakan untuk mengobati anemia (kekurangan sel darah merah), akibat" +"\n"+
                    "kekurangan zat besi dalam tubuh.");
        }else if (btnObat5.getText().equals("Glibenclamide")){
            lblDeskripsiObat.setText("Penyakit diabetes tipe 2 dapat terjadi karena hormon insulin dalam tubuh tidak bekerja secara optimal dalam mengontrol kadar gula darah." +"\n"+
                    "Meski kondisi ini tidak dapat disembuhkan, diabetes tipe 2 dapat dikelola agar tidak menimbulkan komplikasi penyakit lain." +"\n"+
                    "Salah satu obat yang dapat digunakan untuk membantu kondisi ini adalah glibenclamide. Glibenclamide bekerja dengan cara" +"\n"+
                    "menghasilkan insulin, agar dapat menurunkan kadar gula darah dalam tubuh.");
        }else if (btnObat5.getText().equals("Hydrochlorothiazide")){
            lblDeskripsiObat.setText("HCTZ adalah obat yang digunakan untuk mengatasi retensi (cairan tertahan di jaringan) sehingga bengkak pada pasien yang menderita gagal" +"\n"+
                    "jantung kongestif, sirosis pada hati, atau gangguan ginjal, atau bengkak yang diakibatkan terlalu banyak meminum obat" +"\n"+
                    "steroid atau estrogen. HCTZ juga dapat digunakan untuk pasien hipertensi. HCTZ merupakan diuretik golongan thiazide" +"\n"+
                    "yang bekerja dengan cara membantu tubuh agar tidak menyerap terlalu banyak garam yang akhirnya menimbulkan retensi cairan.");
        }else if (btnObat5.getText().equals("Indomethacin")){
            lblDeskripsiObat.setText("Indomethacin adalah obat yang digunakan untuk mengobati nyeri untuk penyakit-penyakit peradangan pada sendi. Selain itu, indometachin" +"\n"+
                    "juga dapat digunakan untuk mengobati nyeri bahu yang disebabkan oleh bursitis atau peradangan pada bagian bursa" +"\n"+
                    "(kantong berisi cairan pelumas yang terletak pada sendi) atau tendonitis (peradangan yang terjadi pada tendon)." +"\n"+
                    "Indomethacin merupakan jenis obat golongan anti-inflamasi non steroid atau NSAID (nonsteroidal anti-inflammatory drug)." +"\n"+
                    "Obat ini bekerja dengan cara mengurangi hormon yang menyebabkan inflamasi dan nyeri pada tubuh.");
        }else if (btnObat5.getText().equals("Ketoprofen")){
            lblDeskripsiObat.setText("Ketoprofen dapat digunakan untuk mengobati nyeri dan peradangan yang disebabkan oleh arthritis (peradangan sendi). Selain itu, ketoprofen" +"\n"+
                    "juga dapat digunakan untuk mengobati nyeri ringan sampai sedang atau nyeri saat menstruasi.Ketoprofen merupakan" +"\n"+
                    "obat golongan NSAID (nonsteroidal anti-inflammatory drug), yang bekerja dengan cara mengurangi hormon yang menyebabka" +"\n"+
                    "peradangan dan nyeri pada tubuh.");
        }else if (btnObat5.getText().equals("Lactulose")){
            lblDeskripsiObat.setText("Lactulose digunakan untuk mengobati konstipasi kronis. Lactulose terkadang juga digunakan untuk mengobati atau mencegah kondisi gangguan" +"\n"+
                    "otak akibat gagal hati yang dapat memicu timbulnya rasa kebingungan, gangguan mengingat atau berpikir, perubahan perilaku," +"\n"+
                    "gemetar, merasa terganggu, gangguan tidur, kehilangan koordinasi, dan kehilangan kesadaran. Lactulose merupakan sejenis gula" +"\n"+
                    "yang akan terurai di dalam usus besar menjadi asam lemah. Asam lemah ini nantinya akan menarik air masuk ke usus besar sehingga" +"\n"+
                    "membantu melembutkan feses.");
        }else if (btnObat5.getText().equals("Memantine")){
            lblDeskripsiObat.setText("Salah satu jenis obat yang sering digunakan untuk mengatasi kondisi demensia akibat penyakit alzheimer ini adalah memantine. Memantine" +"\n"+
                    "merupakan antagonis reseptor N-metil-D-aspartat (NMDA) nonkompetitif yang mengikat saluran kation yang dioperasikan reseptor NMDA." +"\n"+
                    "Memantine akan menghambat kerja glutamat (neurotransmitter rangsang utama di sistem saraf pusat). Glutamat dapat berperan pada" +"\n"+
                    "perkembangan penyakit alzheimer dengan merangsang berbagai reseptor glutamat yang mengakibatkan excitotoxicity (stimulasi terus-" +"\n"+
                    "menerus dari sel saraf oleh neurotransmitter) dan kematian sel saraf.");
        }else if (btnObat5.getText().equals("Nebivolol")){
            lblDeskripsiObat.setText("Nebivolol merupakan obat antihipertensi atau tekanan darah tinggi (hipertensi) untuk mengurangi risiko stroke, serta gagal jantung." +"\n"+
                    "Nebivolol merupakan obat antihipertensi dari golongan beta bloker yang mempengaruhi jantung dan sirkulasi darah. Obat ini dapat" +"\n"+
                    "bekerja sebagai vasodilator atau memiliki kemampuan melebarkan pembuluh darah sehingga aliran darah pun meningkat, dan hipertensi" +"\n"+
                    "bisa diturunkan.");
        }else if (btnObat5.getText().equals("Paromomycin")){
            lblDeskripsiObat.setText("Paromomycin digunakan untuk mengobati infeksi usus. Obat ini juga dapat digunakan untuk mengobati gangguan hati tertentu. Paromomycin" +"\n"+
                    "merupakan obat golongan antibiotik yang melawan bakteri penyebab infeksi.");
        }else if (btnObat5.getText().equals("Regdanvimab")){
            lblDeskripsiObat.setText("Persetujuan Penggunaan Darurat regdanvimab adalah untuk pengobatan Corona Virus Disease 2019 (Covid-19) terkonfirmasi pada pasien dewasa" +"\n"+
                    "yang tidak memerlukan terapi oksigen dan berisiko tinggi mengalami Covid-19 yang berat. Regdanvimab merupakan antibodi monoklonal" +"\n"+
                    "yang dapat menetralisasi berbagai varian virus SARS-Cov-2 dengan cara berikatan pada receptor binding domain (RBD) spike protein" +"\n"+
                    "SARS-CoV-2 dan menghambat interaksinya dengan reseptor angiotensin converting enzyme 2 (ACE2). Dengan mencegah masuknya virus ke" +"\n"+
                    "dalam sel dan terjadinya infeksi SARS-CoV-2, regdanvimab dapat meminimalisir terjadinya perburukan dan mempersingkat waktu perbaikan" +"\n"+
                    "gejala.");
        }else if (btnObat5.getText().equals("Scopolamine")){
            lblDeskripsiObat.setText("Scopolamine digunakan untuk mencegah mual muntah akibat mabuk perjalanan atau penggunaan anestesi selama operasi. Scopolamine bekerja pada" +"\n+"+
                    "sistem saraf pusat dengan memberikan rasa tenang pada perut.");
        }else if (btnObat5.getText().equals("Telmisartan")){
            lblDeskripsiObat.setText("Telmisartan adalah obat yang digunakan untuk mengatasi tekanan darah tinggi (hipertensi) dan biasanya dikombinasikan dengan obat" +"\n"+
                    "antihipertensi lainnya. Obat ini umumnya juga digunakan untuk menurunkan risiko stroke, serangan jantung, atau kematian pada pasien" +"\n"+
                    "dengan gangguan jantung. Telmisartan termasuk obat golongan angiotensin II reseptor bloker (ARB). Obat ini berfungsi memblokir zat di" +"\n"+
                    "dalam tubuh, yang menyebabkan pembuluh darah menyempit. Cara kerjanya adalah dengan merelaksasi pembuluh darah, sehingga terjadi" +"\n"+
                    "penurunan tekanan darah serta peningkatan suplai darah dan oksigen ke jantung.");
        }else if (btnObat5.getText().equals("Vasopressin")){
            lblDeskripsiObat.setText("Vasopressin adalah obat yang digunakan untuk mencegah hilangnya cairan dari dalam tubuh dengan cara mengurangi pengeluaran urine." +"\n"+
                    "Obat ini juga membantu kerja ginjal dalam menyerap ulang (reabsorbsi) cairan ke dalam tubuh. Selain itu, vasopressin juga dapat" +"\n"+
                    "meningkatakan tekanan darah dengan mempersempit pembuluh darah, serta mengatasi diabetes insipidus. Vasopressin bekerja seperti" +"\n"+
                    "hormon anti-diuretik yang di keluarkan oleh kelenjar pituitari. Obat ini bekerja di ginjal dan pembuluh darah.");
        }

    }

    @FXML
     void btnonactionObat6(ActionEvent event){
        if (btnObat6.getText().equals("Acyclovir")){
            lblDeskripsiObat.setText("Ini adalah obat antivirus untuk mengobati berbagai jenis infeksi herpes. Biasanya herpes simpleks pada pada alat kelamin, atau" +"\n"+
                    "digunakan untuk mencegah kekambuhan. Acyclovir juga digunakan untuk pencegahan herpes simplex pada pasien yang bermasalah dengan" +"\n"+
                    "sistem imunnya. Jika Kamu cacar air (Varicella Zoster) atau cacar ular/cacar api (Herpes Zoster), Kamu akan diberikan obat ini.");
        }else if (btnObat6.getText().equals("Betametason")){
            lblDeskripsiObat.setText("Betametason digunakan untuk mengobati berbagai masalah kesehatan, seperti gejala alergi, asma, gangguan kalenjar adrenal, masalah" +"\n"+
                    "pada darah, kulit kemerahan, dan bengkak-bengkak pada tubuh. Betametason bekerja dengan cara menghambat senyawa-senyawa tertentu" +"\n"+
                    "dalam tubuh yang dapat menyebabkan peradangan.");
        }else if (btnObat6.getText().equals("Carbamazepine")){
            lblDeskripsiObat.setText("Carbamazepine adalah obat yang digunakan untuk terapi kejang dan nyeri pada saraf,  seperti trigeminal neuralgia yaitu nyeri pada" +"\n"+
                    "wajah yang menyiksa dan diabetik nefropati yaitu komplikasi pada ginjal akibat diabetes. Carbamazepine bekerja dengan cara" +"\n"+
                    "mengurangi impuls pada saraf yang menyebabkan kejang dan rasa nyeri.");
        }else if (btnObat6.getText().equals("Dexketoprofen")){
            lblDeskripsiObat.setText("Dexketoprofen adalah obat yang digunakan untuk menghilangkan rasa nyeri ringan sampai sedang. Dexketoprofen termasuk ke dalam antinyeri" +"\n"+
                    "golongan NSAID (non-steroidal anti-inflammatory drug) yang bekerja dengan cara mengurangi pembentukkan senyawa prostaglandin" +"\n"+
                    "(senyawa yang menyebabkan rasa nyeri dalam tubuh).");
        }else if (btnObat6.getText().equals("Ergotamine")){
            lblDeskripsiObat.setText("Ergotamine merupakan obat golongan ergot alkaloid. Cara kerja ergotamine adalah dengan menyempitkan pembuluh darah di area otak yang" +"\n"+
                    "menyebabkan nyeri. Ergotamine juga memengaruhi pola aliran darah yang terkait dengan beberapa tipe sakit kepala. Selain nyeri" +"\n"+
                    "akibat migrain, ergotamine juga memiliki beberapa efek samping saat digunakan, seperti mual, muntah, sakit perut, rasa kebas" +"\n"+
                    "atau mati rasa pada jari dan telapak kaki, nyeri otot pada ujung-ujung jari, kaki terasa lemas.");
        }else if (btnObat6.getText().equals("Fexofenadine")){
            lblDeskripsiObat.setText("Fexofenadine merupakan obat antihistamin yang mengurangi efek dari histamin alami yang dihasilkan oleh tubuh. Histamin dapat memproduksi" +"\n"+
                    "gejala bersin-bersin, gatal, mata berair, dan hidung berair yang biasa muncul saat seseorang mengalami alergi. ");
        }else if (btnObat6.getText().equals("Glimepiride")){
            lblDeskripsiObat.setText("Obat glimepiride dapat menurunkan kadar gula darah dalam tubuh dengan cara menstimulasi tubuh agar menghasilkan insulin. ");
        }else if (btnObat6.getText().equals("Hydrocortisone")){
            lblDeskripsiObat.setText("Hydrocortisone adalah obat yang digunakan untuk mengatasi berbagai macam kondisi seperti alergi, gangguan kulit, kolitis ulseratif " +"\n"+
                    "(peradangan kronis yang terjadi pada usus besar (kolon) dan rektum, artritis (peradangan sendi), lupus, psoriasis" +"\n"+
                    "(peradangan kronis akibat penyakit autoimun), hingga gangguan pernapasan. ");
        }else if (btnObat6.getText().equals("Insulin")){
            lblDeskripsiObat.setText("Insulin merupakan salah satu jenis hormon alami dalam tubuh yang diproduksi oleh kelenjar pankreas. Hormon insulin ini bertugas untuk" +"\n"+
                    "memasukkan glukosa ke dalam sel untuk diubah menjadi energi dan disebarkan ke seluruh tubuh. Insulin sebenarnya" +"\n"+
                    "diproduksi secara alami oleh kelenjar pankreas di dalam tubuh. Insulin berperan dalam mengambil glukosa (gula) dalam" +"\n"+
                    "darah untuk dimasukkan ke dalam sel untuk diubah menjadi energi.");
        }else if (btnObat6.getText().equals("Ketorolac")){
            lblDeskripsiObat.setText("Ketorolac merupakan obat golongan NSAID (nonsteroidal anti inflammatory drug) yang bekerja dengan cara mengurangi senyawa dalam tubuh" +"\n"+
                    "yang menyebabkan nyeri, demam, dan peradangan.  Obat ketorolac dapat digunakan untuk meredakan rasa nyeri yang" +"\n"+
                    "sedang sampai berat.");
        }else if (btnObat6.getText().equals("Lanolin")){
            lblDeskripsiObat.setText("Lanolin merupakan senyawa alami yang terdapat pada bulu domba. Lanolin dapat melembutkan dan melembapkan kulit dengan cara membentuk" +"\n"+
                    "lapisan berminyak pada lapisan kulit paling atas dan akan memerangkap air pada kulit.");
        }else if (btnObat6.getText().equals("Meropenem")){
            lblDeskripsiObat.setText("Meropenem digunakan untuk mengobati infeksi berat pada kulit maupun perut. Meropenem juga digunakan untuk mengobati meningitis akibat" +"\n"+
                    "bakteri (infeksi pada otak atau saraf tulang belakang). Meropenem merupakan antibiotik yang bekerja dengan cara " +"\n"+
                    "melawan bakteri dalam tubuh.");
        }else if (btnObat6.getText().equals("Nedocromil")){
            lblDeskripsiObat.setText("Nedocromil digunakan untuk mencegah terjadinya asma dan bronkospasma. Namun, jika sudah mengalami serangan asma dan bronkopspasma," +"\n"+
                    "maka tidak perlu mengonsumsi obat ini lagi. Nedocromil bekerja dengan cara memengaruhi sel-sel inflamasi (pembengkakan)" +"\n"+
                    "tertentu di paru-paru, sehingga dicegah agar tidak melepaskan zat-zat yang menyebabkan gejala asma dan bronkospasma.");
        }else if (btnObat6.getText().equals("Pefloxacin")){
            lblDeskripsiObat.setText("Pefloxacin merupakan antibiotik golongan quinolone. Selain itu, obat ini digunakan untuk mengatasi infeksi bakteri. Pefloxacin bekerja" +"\n"+
                    "dengan cara melawan bakteri penyebab infeksi dalam tubuh.");
        }else if (btnObat6.getText().equals("Resorcinol")){
            lblDeskripsiObat.setText("obat Resorsinol termasuk jenis obat topikal yang hanya dapat digunakan di area luar tubuh atau kulit. Obat Resorcinol dapat digunakan " +"\n"+
                    "oleh orang dewasa dan anak-anak. Resorcinol merupakan obat yang dapat digunakan untuk menghancurkan kulit kasar, bersisik" +"\n"+
                    "serta mengeras. Obat ini mampu membunuh kuman yang ada di kulit untuk melawan infeksi.");
        }else if (btnObat6.getText().equals("Sea Water")){
            lblDeskripsiObat.setText("Sea water atau nasalin adalah obat yang digunakan untuk membersihkan saluran pernapasan, melembapkan permukaan hidung yang kering, dan" +"\n"+
                    "sebagai perawatan tambahan pada infeksi THT (Telinga Hidung Tenggorokan). ");
        }else if (btnObat6.getText().equals("Temazepan")){
            lblDeskripsiObat.setText("Temazepam adalah obat yang digunakan untuk mengobati insomnia atau sulit tidur. Obat ini biasanya digunakan untuk jangka pendek saja," +"\n"+
                    "yaitu sekita 7-10 hari. Temazepam adalah benzodiazepine, yang merupakan golongan obat depresan sistem saraf pusat atau" +"\n"+
                    "hipnotis sedatif. Obat ini memperlambat sistam saraf dan menyeimbangkan sinyal kimia dalam otak pada pasien yang kesulitan tidur.");
        }else if (btnObat6.getText().equals("Verapamil")){
            lblDeskripsiObat.setText("Verapamil adalah obat yang digunakan untuk mengatasi hipertensi (tekanan darah tinggi), angina (nyeri dada), dan gangguan detak jantung" +"\n"+
                    "lainnya. Menurunkan tekanan darah dapat mencegah stroke, serangan jantung, dan masalah ginjal. Verapamil merupakan obat" +"\n"+
                    "golongan CCB (kanal kalsium bloker). Itu artinya, obat ini bekerja dengan cara melemaskan otot jantung dan pembuluh darah.");
        }
    }

    @FXML
     void btnonactionObat7(ActionEvent event) {
        if (btnObat7.getText().equals("Albendazole")){
            lblDeskripsiObat.setText("Albendazole adalah obat yang khusus digunakan untuk mengobati penyakit ekinokokus. Apa itu ekinokokus? Ialah sebuah penyakit yang disebabkan" +"\n"+
                    "oleh cacing pita parasit, yang larvanya berasal dari anjing.");
        }else if (btnObat7.getText().equals("Biotin")){
            lblDeskripsiObat.setText("Biotin digunakan untuk mencegah kekurangan biotin. Kekurangan biotin dapat disebabkan oleh kekurangan nutrisi, penurunan berat badan yang cepat," +"\n"+
                    "penggunaan tube-feeding dalam jangka panjang, dan kondisi medis lainnya.");
        }else if (btnObat7.getText().equals("Carbimazole")){
            lblDeskripsiObat.setText("Carbimazole adalah obat yang digunakan untuk mengobati hipertiroidisme, kondisi dimana kadar hormon tiroksin di dalam tubuh terlalu tinggi.");
        }else if (btnObat7.getText().equals("Dextromethorphan")){
            lblDeskripsiObat.setText("Dextromethorphan digunakan untuk mengobati batuk namun tidak dapat digunakan untuk mengobati batuk yang disebabkan oleh rokok, asma, atau " +"\n"+
                    "emfisema (kantung udara dalam paru-paru hancur secara bertahap.");
        }else if (btnObat7.getText().equals("Erythromycin")){
            lblDeskripsiObat.setText("Erythromycin adalah antibiotik yang digunakan untuk mencegah atau mengobati berbagai macam infeksi yang disebabkan oleh bakteri.Gliquidone " +"\n"+
                    "bekerja dengan cara menstimulasi produksi insulin alami dan menormalkan perubahan metabolik dalam tubuh.");
        }else if (btnObat7.getText().equals("Fibrinogen")){
            lblDeskripsiObat.setText("Fibrinogen digunakan untuk mengatasi perdarahan pada orang yang menderita kekurangan fibrinogen dari lahir.");
        }else if (btnObat7.getText().equals("Gliquidone")){
            lblDeskripsiObat.setText("Gliquidone bekerja dengan cara menstimulasi produksi insulin alami dan menormalkan perubahan metabolik dalam tubuh.");
        }else if (btnObat7.getText().equals("Hydroquinone")){
            lblDeskripsiObat.setText("Hydroquinone menurunkan pembentukkan melanin pada kulit. Melanin merupakan pigmen pada kulit yang memberikan warna coklat pada kulit.");
        }else if (btnObat7.getText().equals("Ipratropium bromide")){
            lblDeskripsiObat.setText("Ipratropium bromide adalah obat yang digunakan untuk mengatasi PPOK (penyakit paru obstruktif kronis atau sering disebut COPD), asma, dan" +"\n"+
                    "rhinorhoea yang disertai rhinitis.");
        }else if (btnObat7.getText().equals("Ketotifen")){
            lblDeskripsiObat.setText("Ketotifen merupakan jenis obat antihistamin yang bekerja dengan cara mengurangi efek dari histamin alami yang ada dalam tubuh.");
        }else if (btnObat7.getText().equals("Lansoprazole")){
            lblDeskripsiObat.setText("Lansoprazole digunakan untuk mengobati dan mencegah terjadinya ulkus atau luka lambung dan usus, erosif esofagitis (kerusakan pada kerongkongan" +"\n"+
                    "akibat asam lambung), dan kondisi lain yang melibatkan asam lambung yang berlebihan.");
        }else if (btnObat7.getText().equals("Metamfetamin")){
            lblDeskripsiObat.setText("Metamfetamin digunakan untuk mengobati gangguan hiperaktif (ADHD), mengobati obesitas (antiobesitas), dan mampu meningkatkan tekanan darah" +"\n"+
                    "(antihipotensi). ");
        }else if (btnObat7.getText().equals("Nefazodone")){
            lblDeskripsiObat.setText("Nefazodone digunakan untuk mengobati depresi, termasuk gangguan depresi mayor. Nefazodone ini dapat membantu mengembalikan keseimbangan" +"\n"+
                    "tertentu dari bahan kimia yang ada di otak.");
        }else if (btnObat7.getText().equals("Penbutolol")){
            lblDeskripsiObat.setText("Penbutolol adalah obat golongan β-blocker non-kardioselektif. Oleh karena itu, obat ini dapat bekerja dengan melebarkan pembuluh darah" +"\n"+
                    "sehingga menurunkan tekanan darah dan meningkatkan aliran darah.");
        }else if (btnObat7.getText().equals("Riboflavin")){
            lblDeskripsiObat.setText("Riboflavin digunakan untuk mengobati dan mencegah kekurangan vitamin B2.");
        }else if (btnObat7.getText().equals("Secukinumab")){
            lblDeskripsiObat.setText("Secukinumab merupakan obat imunosupresan yang bekerja dengan cara menurunkan senyawa yang menyebabkan inflamasi/peradangan.");
        }else if (btnObat7.getText().equals("Tembaga")){
            lblDeskripsiObat.setText("Tembaga dapat digunakan sebagai obat untuk mengatasi kekurangan tembaga, anemia, dan osteoarthritis (sendi sakit, kaku, dan bengkak).");
        }else if (btnObat7.getText().equals("Vildagliptin")){
            lblDeskripsiObat.setText("Vildagliptin adalah obat antidiabetik yang digunakan secara tunggal atau bisa dikombinasikan dengan obat lain, untuk mengoabati diabetes" +"\n"+
                    "tipe 2 pada orang dewasa.");
        }

    }

    @FXML
     void btnonactionObat8(ActionEvent event) {
        if (btnObat8.getText().equals("Albumin")){
            lblDeskripsiObat.setText("Albumin digunakan sebagai pengobatan untuk Kamu yang mengalami kondisi hipovolemia (kekurangan cairan tubuh), hipoalbuminemia" +"\n"+
                    "(kekurangan albumin, dan setelah tindakan pengeluaran cairan perut pada pasien ascites (penumpukan cairan di rongga" +"\n"+
                    "perut sehingga perut membesar). Albumin serum biasanya ditemukan secara alami dalam darah manusia.");
        }else if (btnObat8.getText().equals("Bisacodyl")){
            lblDeskripsiObat.setText("Bisacodyl digunakan untuk mengobati konstipasi atau mengosongkan usus sebelum operasi, kolonoskopi, x-rays, maupun prosedur medis lainnya" +"\n"+
                    "yang berhubungan dengan usus. Bisacodyl merupakan obat laksatif yang dapat merangsang pergerakan usus, sehingga memicu" +"\n"+
                    "untuk buang air besar.");
        }else if (btnObat8.getText().equals("Carvedilol")){
            lblDeskripsiObat.setText("Carvedilol adalah obat yang digunakan untuk mengobati gagal jantung dan hipertensi. Obat ini juga bisa digunakan untuk pengobatan pasca" +"\n"+
                    "serangan jantung yang diakibatkan oleh ketidakmampuan organ tersebut untuk memompa darah dengan baik. Carvedilol termasuk" +"\n"+
                    "ke dalam golongan obat beta blocker yang dapat memengaruhi jantung dan sirkulasi darah pada pembuluh vena dan arteri.");
        }else if (btnObat8.getText().equals("Dextrose")){
            lblDeskripsiObat.setText("Dextrose atau glukosa digunakan untuk mengobati kadar gula darah yang sangat rendah (hipoglikemia), biasanya terjadi pada pasien yang" +"\n"+
                    "menderita diabetes melitus. Glukosa merupakan bentuk dari gula natural yang secara umum diproduksi di hati. Glukosa merupakan" +"\n"+
                    "sumber energi, dan semua sel dalam tubuh dan organ tubuh membutuhkan glukosa agar dapat berfungsi dengan normal.");
        }else if (btnObat8.getText().equals("Escitalopram")){
            lblDeskripsiObat.setText("Escitalopram digunakan untuk mengobati depresi dan kecemasan. Escitalopram bekerja dengan memengaruhi hormon serotonin. Hormon ini digunakan" +"\n"+
                    "untuk mengatur mood, nafsu makan, tidur dan lainnya.");
        }else if (btnObat8.getText().equals("Finasteride")){
            lblDeskripsiObat.setText(" finasteride untuk mengatasinya. Obat finasteride digunakan untuk mengatasi kebotakan pada pria. Senyawa DHT memicu berkembangnya penyakit " +"\n"+
                    "Benign Prostatic Hyperplasia (BPH). Karenanya, finasteride mencegah perubahan testosteron (hormon seks pria) menjadi senyawa " +"\n"+
                    "dihydrotestosterone (DHT) dalam tubuh.");
        }else if (btnObat8.getText().equals("Glucagon")){
            lblDeskripsiObat.setText("Glucagon digunakan untuk mengobati hipoglikemia (kadar gula darah rendah). Selain itu, glucagon juga dapat digunakan saat pemeriksaan radiologi" +"\n"+
                    "(X-ray) untuk membantu mendiagnosis penyakit tertentu pada lambung dan usus. Glucagon merupakan hormon yang dapat meningkatkan" +"\n"+
                    "kadar gula darah. Glucagon juga dapat memperlambat pergerakan otot halus pada lambung dan usus yang membantu pencernaan.");
        }else if (btnObat8.getText().equals("Hyoscine")){
            lblDeskripsiObat.setText("Hyoscine digunakan untuk mengurangi kram pada otot perut, usus, kandung kemih. Obat ini juga dapat digunakan untuk mengurangi gejala Irritable Bowel" +"\n"+
                    "Syndrome (IBS), yaitu penyakit pencernaan yang umum yang memengaruhi kerja usus besar. Hyoscine bekerja dengan cara merilekskan" +"\n"+
                    "otot polos, mengurangi asam lambung dan menurunkan pergerakan usus.");
        }else if (btnObat8.getText().equals("Irbesartan")){
            lblDeskripsiObat.setText("Irbesartan digunakan untuk mengobati hipertensi atau tekanan darah yang tinggi. Selain itu, irbesartan juga dapat digunakan untuk mengatasi gangguan" +"\n"+
                    "ginjal yang disebabkan oleh diabetes tipe 2. Irbesartan merupakan obat antihipertensi golongan antagonis reseptor angiotensin II " +"\n"+
                    "yang bekerja dengan cara menjaga agar pembuluh darah tetap melebar sehingga tekanan darah dapat menurun dan aliran darah menjadi lancar.");
        }else if (btnObat8.getText().equals("Kloramfenikol")){
            lblDeskripsiObat.setText("Kloramfenikol adalah obat yang digunakan untuk mengobati infeksi yang disebabkan oleh bakteri. Kloramfenikol termasuk ke dalam golongan obat" +"\n"+
                    "antibiotik. Obat ini  bekerja dengan cara menghambat pertumbuhan bakteri dalam tubuh.");
        }else if (btnObat8.getText().equals("Levodopa")){
            lblDeskripsiObat.setText("Levodopa digunakan untuk mengobati penyakit parkinson, yakni penyakit saraf yang memengaruhi gerakan otot akibat kurangnya kadar dopamin" +"\n"+
                    "dalam tubuh. Gejala penyakit parkinson adalah tubuh gemetar dan gerakan tubuh menjadi kaku. Levodopa merupakan prekursor dopamin." +"\n"+
                    "Penggunaan obat levodopa akan meningkatkan kontrol otot dengan mengembalikan kadar dopamin dalam tubuh. Saat kadar dopamin mencukupi," +"\n"+
                    "pergerakan otot akan kembali normal.");
        }else if (btnObat8.getText().equals("Metampicillin")){
            lblDeskripsiObat.setText("Metampicillin digunakan untuk mengobati infeksi bakteri yang rentan dialami oleh manusia. Metampicillin merupakan antibiotik yang membunuh " +"\n"+
                    "bakteri dengan menghambat pembentukkan dinding sel bakteri.");
        }else if (btnObat8.getText().equals("Neomycin")){
            lblDeskripsiObat.setText("Neomycin adalah antibiotik dari golongan aminoglikosida. Tentu saja digunakan untuk mengobati atau mencegah infeksi bakteri. Neomycin kerap " +"\n"+
                    "digunakan untuk menurunkan risiko infeksi usus setelah dilakukan operasi. Neomycin juga digunakan untuk menurunkan gejala koma " +"\n"+
                    "hepatikum (kemunduran fungsi otak akibat zat-zat racun dalam darah, yang dalam keadaan normal dibuang oleh hati). Neomycin bekerja " +"\n"+
                    "dengan mengganggu pembentukan protein pada bakteri sehingga bakteri akan mati.");
        }else if (btnObat8.getText().equals("Penciclovir")){
            lblDeskripsiObat.setText("Penciclovir digunakan untuk mengobati kulit melepuh pada bibir maupun daerah mulut akibat penyakit herpes simpleks. Obat ini untuk orang " +"\n"+
                    "dewasa dan anak-anak yang berusia setidaknya 12 tahun. Penciclovir merupakan obat antivirus yang bekerja menghentikan atau mencegah" +"\n"+
                    "perkembangbiakan dan perluasan infeksi virus.");
        }else if (btnObat8.getText().equals("Rifabutin")){
            lblDeskripsiObat.setText("Rifabutin digunakan untuk mencegah infeksi bakteri Mycobacterium avium complex pada pasien dengan HIV. Rifabutin juga digunakan untuk mengobati" +"\n"+
                    "tuberkulosis pada pasien dengan HIV. Obat ini bekerja sebagai antibiotik untuk melawan bakteri.");
        }else if (btnObat8.getText().equals("Selegenile")){
            lblDeskripsiObat.setText("Selegiline adalah obat yang digunakan untuk mengatasi gangguan pergerakan akibat penyakit Parkinson. Obat ini tidak untuk mengobati penyakit" +"\n"+
                    "Parkinson, hanya meredakan gejalanya saja seperti tremor, kekakuan otot, dan hilangnya pergerakan normal. Selegiline bisa dapat" +"\n"+
                    "meningkatkan kemampuan pasien untuk lebih mudah bergerak. Selegiline bekerja dengan cara mencegah pemecahan dopamine, sehingga jumlah" +"\n"+
                    "dopamine tidak menurun. Pasalnya, penyakit Parkinson terjadi akibat turunnya jumlah dopamine dalam otak.");
        }else if (btnObat8.getText().equals("Tenofovir")){
            lblDeskripsiObat.setText("Tenofovir adalah obat yang digunakan untuk mengobati HIV, virus yang menyebabkan AIDS (penurunan sistem imun). Namun, tenofovir tidak dapat" +"\n"+
                    "menyembuhkan HIV/AIDS. Obat ini juga bisa digunakan untuk mengatasi hepatitis B kronis. Tenofovir merupakan antivirus yang bekerja" +"\n"+
                    "dengan cara mencegah HIV (human immunodeficiency virus). Obat ini juga menangkal virus hepatitis B yang bertambah banyak dalam tubuh penderitanya.");
        }else if (btnObat8.getText().equals("Vincristine")){
            lblDeskripsiObat.setText("Vincristine merupakan obat yang digunakan untuk mengobati leukemia, penyakit limfoma Hodgkin, limfoma non Hodgkin, rhabdomiosarkoma " +"\n"+
                    "(tumor jaringan lunak), neuroblastoma (kanker jaringan syaraf) dan tumor Wilm. Obat ini juga dikombinasikan dengan obat kanker" +"\n"+
                    "lainnya untuk meningkatkan tingkat kesembuhan. Vincristine merupakan obat kanker yang bekerja dengan cara menangkal pertumbuhan" +"\n"+
                    "sel kanker dan memperlambat penyebarannya di dalam tubuh.");
        }

    }

    @FXML
     void btnonactionObat9(ActionEvent event) {
        if (btnObat9.getText().equals("Alginic Acid")){
            lblDeskripsiObat.setText("Alginic acid atau asam alginat adalah salah satu jenis karbohidrat alami yang terdapat dalam rumput laut cokelat. Sebagai obat, " +"\n"+
                    "alginic acid biasanya dikombinasikan dengan aluminium hidroksida dan magnesium karbonat untuk membentuk antasida yang " +"\n"+
                    "dapat meredakan gejala akibat peningkatan asam lambung pada penyakit Gastroesophageal reflux disease (GERD) atau gangguan " +"\n"+
                    "pencernaan lainnya. Asam alginat bekerja dengan membentuk penghalang fisik yang mengambang di dalam asam lambung sehingga bisa " +"\n"+
                    "mengurangi refluks asam ke kerongkongan.");
        }else if (btnObat9.getText().equals("Boron")){
            lblDeskripsiObat.setText("Boron digunakan untuk kondisi kekurangan boron, mengurangi nyeri haid, membangun tulang yang kuat, mengobati peradangan pada tulang, suplemen" +"\n"+
                    "tambahan untuk membentuk otot dan meningkatkan kadar testosteron, serta membantu meningkatkan kemampuan berpikir dan koordinasi otot." +"\n"+
                    "Boron memengaruhi tubuh dalam mengatur mineral lain, seperti kalsium, magnesium, dan fosfat. Boron juga dapat meningkatkan kadar estrogen" +"\n"+
                    "pada wanita yang sudah menopause dan pada pria yang sehat. Estrogen membantu tubuh mempertahankan tulang yang sehat dan kesehatan mental.");
        }else if (btnObat9.getText().equals("Caspofungin")){
            lblDeskripsiObat.setText("Caspofungin digunakan untuk mengatasi infeksi fungi (jamur) pada lambung, paru-paru, esofagus, dan bagian tubuh bagian dalam lainnya. Caspofungin" +"\n"+
                    "merupakan obat antifungi yang bekerja dengan cara melawan infeksi akibat jamur (fungus).");
        }else if (btnObat9.getText().equals("Diazepam")){
            lblDeskripsiObat.setText("Diazepam merupakan obat golongan benzodiazepine yang bekerja dengan cara menyeimbangkan senyawa kimia di otak pada pasien yang mengalami gangguan" +"\n"+
                    "kecemasan.");
        }else if (btnObat9.getText().equals("Esomeprazole")){
            lblDeskripsiObat.setText("Esomeprazole digunakan untuk mengobati penyakit GERD (naiknya asam lambung kembali ke kerongkongan) dan kondisi lain yang memicu asam lambung" +"\n"+
                    "keluar berlebihan seperti sindrom zollinger-Ellison. Sindrom ini ditandai dengan kemunculan satu atau beberapa tumor gastrinoma di" +"\n"+
                    "pankreas atau di usus halus bagian atas, yaitu usus dua belas jari. Esomeprazole merupakan obat golongan proton pump inhibitor yang" +"\n"+
                    " \bekerja dengan cara mengurangi jumlah produksi asam lambung.");
        }else if (btnObat9.getText().equals("Fluconazole")){
            lblDeskripsiObat.setText("Fluconazole digunakan untuk mengobati infeksi jamur yang menyerang bagian tubuh, seperti mulut, tenggorokan, kerongkongan, paru-paru, kandung kemih," +"\n"+
                    "area genital, dan darah. Fluconazole juga dapat digunakan untuk mencegah infeksi jamur pada pasien yang memiliki sistem imun lemah" +"\n"+
                    "akibat terapi kanker, transplatansi sumsum tulang belakang, atau penderita penyakit AIDS. Fluconazole merupakan obat antifungi (anti jamur)," +"\n"+
                    "yang bekerja dengan cara menghambat pertumbuhan jamur yang menginfeksi tubuh.");
        }else if (btnObat9.getText().equals("Glucosamine")){
            lblDeskripsiObat.setText("Glucosamine digunakan sebagai suplemen untuk membantu mengatasi nyeri sendi, pembengkakan, dan kekakuan yang disebabkan oleh penyakit arthritis" +"\n"+
                    "(peradangan sendi). Glucosamine merupakan protein gula yang dapat membantu tubuh untuk membangun cartilago (tulang rawan). Glucosamine" +"\n"+
                    "secara alami dapat ditemukan di dalam tulang, sumsum tulang, kerang, dan jamur.");
        }else if (btnObat9.getText().equals("Hyoscyamine")){
            lblDeskripsiObat.setText("Berbagai masalah pada lambung yang tidak tertahankan dapat dibantu diredakan dengan obat. Salah satunya hyoscyamine. Ini adalah obat untuk " +"\n"+
                    "mengobati berbagai gangguan pada usus dan lambung seperti tukak atau luka pada lambung dan sindrom iritasi usus besar. Hyoscyamine " +"\n"+
                    "bekerja dengan cara mengurangi produksi asam lambung, memperlambat gerakan alami dari usus, dan merelaksasi otot-otot di banyak organ " +"\n"+
                    "seperti perut, usus, kandung kemih, ginjal, atau kandung empedu.");
        }else if (btnObat9.getText().equals("Isoniazid")){
            lblDeskripsiObat.setText("Isoniazid digunakan untuk mengobati dan mencegah penyakit tuberkulosis (TB). Penggunaan isoniazid biasanya akan dikombinasikan dengan obat TB " +"\n"+
                    "lain untuk mengobati TB aktif. Tuberkulosis dapat menjadi kebal jika obat ini digunakan sebagai pengobatan tunggal TB. Isoniazid" +"\n"+
                    "merupakan antibiotik yang bekerja dengan cara melawan bakteri dalam tubuh.");
        }else if (btnObat9.getText().equals("Levofloxacin")){
            lblDeskripsiObat.setText("Levofloxacin digunakan untuk mengobati infeksi bakteri pada kulit, sinus, ginjal, kandung kemih, atau prostat. Levofloxacin juga digunakan untuk " +"\n"+
                    "mengobati infeksi bakteri yang menyebabkan bronkitis atau radang paru-paru, serta mengobati orang-orang yang terkena anthrax " +"\n"+
                    "(penyakit kulit akibat bakteri Bacillus anthracis). Levofloxacin merupakan obat golongan antibiotik yang dapat menghambat " +"\n"+
                    "pertumbuhan bakteri baik, seperti bakteri gram negatif maupun bakteri gram positif. ");
        }else if (btnObat9.getText().equals("Metformin")){
            lblDeskripsiObat.setText("Metformin menurunkan kadar glukosa hati dengan cara menginhibisi glukoneogenesis (sintesis glukosa dari senyawa bukan karbohidrat misalnya asam " +"\n"+
                    "laktat dan beberapa asam amino) dan glikogenesis (proses pembentukan glikogen dari glukosa), memperlambat absorpsi glukosa" +"\n"+
                    " di usus, serta meningkatkan sensitivitas insulin.");
        }else if (btnObat9.getText().equals("Neostigmine")){
            lblDeskripsiObat.setText("Neostigmine digunakan untuk mengobati penyakit myasthenia gravis. Myasthenia gravis merupakan penyakit autoimun kronis dari transmisi neuromuskular, " +"\n"+
                    "yang menghasilkan kelemahan otot dan dapat menyerang otot bagian tubuh mana saja. Namun, otot yang paling umum terserang " +"\n"+
                    "ialah otot yang mengontrol gerakan mata, kelopak mata, mengunyah, menelan, batuk, maupun ekspresi wajah. Neostigmine bekerja " +"\n"+
                    "dengan menghambat penguraian asetilkolin, yang berfungsi untuk menguatkan kembali kerja otot. Selain itu, obat yang satu ini " +"\n"+
                    "juga bekerja dengan memperbaiki sistem saraf otot.");
        }else if (btnObat9.getText().equals("Perindopril")){
            lblDeskripsiObat.setText("Perindopril digunakan untuk mengobati tekanan darah tinggi (hipertensi). Selain itu, obat ini digunakan untuk mencegah serangan jantung akibat" +"\n"+
                    " penyakit arteri koroner. Perindopril adalah obat golongan ACE inhibitor yang bekerja dengan menghambat perubahan enzim" +"\n"+
                    "angiotensin I menjadi angiotensin II. Angiotensi II merupakan vasokonstriktor. Vasokonstrikor inilah yang menyebabkan " +"\n"+
                    "penyempitan pembuluh darah.");
        }else if (btnObat9.getText().equals("Rifampicin")){
            lblDeskripsiObat.setText("Rifampicin digunakan untuk mengobati pasien tuberkulosis, leprosi, penyakit legionnaires, maupun infeksi serius dari staphylococcal dan " +"\n"+
                    "brucellosis. Rifampicin bekerja sebagai antibiotik untuk melawan bakteri.");
        }else if (btnObat9.getText().equals("Sertraline")){
            lblDeskripsiObat.setText("Sertraline digunakan untuk mengobati berbagai gangguan mental seperti depresi, gangguan obsesif kompulsif, kepanikan, gangguan kecemasan, " +"\n"+
                    "stres setelah kejadian traumatik dan gangguan premenstruasi disforia. Setraline merupakan obat antidepresan golongan SSRI. " +"\n"+
                    "Setraline bekerja dengan menyeimbangkan sinyal kimia dalam otak sehingga menurunkan gejala depresi, kepanikan, kecemasan dan " +"\n"+
                    "gejala obsesif-kompulsif.");
        }else if (btnObat9.getText().equals("Teofilin")){
            lblDeskripsiObat.setText("Teofilin adalah obat yang digunakan untuk mengobati penyakit pernapasan, seperti asma, PPOK, bronkitis, emfisema, dan sebagainya. Obat ini " +"\n"+
                    "harus digunakan secara rutin untuk mencegah kesulitan atau sesak napas. Teofilin termasuk ke dalam jenis bronkodilator atau " +"\n"+
                    "xanthines. Obat ini bekerja di saluran pernapasan dengan cara merelaksasi otot paru-paru dan dada, memperlebar saluran napas, " +"\n"+
                    "dan menurunkan sensitivitas paru-paru terhadap alergen (zat yang menimbulkan alergi).");
        }else if (btnObat9.getText().equals("Vitamin A")){
            lblDeskripsiObat.setText("Vitamin A pada umumnya sangat penting untuk kesehatan mata, sistem imun, dan pertumbuhan sel. Vitamin A terbagi menjadi dua, yaitu yang bersumber" +"\n"+
                    " dari hewani dan sering disebut retinoid, serta yang bersumber dari nabati dan sering disebut beta karoten. Retinoid dalam bentuk " +"\n"+
                    "oral dan topikal biasanya digunakan untuk mengobati jerawat dan kondisi kulit lain, misalnya seperti bercak hitam. Vitamin A oral " +"\n"+
                    "juga sering digunakan untuk mengatasi campak, mata kering, serta beberapa tipe leukemia. ");
        }
    }

    @FXML
     void btnonactionObat10(ActionEvent event) {
        if (btnObat10.getText().equals("Allopurinol")){
            lblDeskripsiObat.setText("Allopurinol merupakan obat yang digunakan untuk terapi asam urat. Asam urat dalam istilah medis disebut gout, yang ditandai dengan merah dan " +"\n"+
                    "pembengkakan di sendi. Asam urat terjadi karena kelebihan asam urat di darah atau disebut hiperurisemia. Beberapa jenis kanker dapat " +"\n"+
                    "menyebabkan hiperurisemia, dan dapat diobati dengan obat ini. Selain itu digunakan untuk mengobati penyumbatan akibat batu ginjal " +"\n"+
                    "yang disebabkan kalsium oksalat yang kerap kambuh.");
        }else if (btnObat10.getText().equals("Botulinum Toxin")){
            lblDeskripsiObat.setText("Botulinum toxin (botox) digunakan untuk mengobati penyakit strabismus (mata juling) dan blefarospasme (berkedip berlebihan), yang disebabkan " +"\n"+
                    "oleh kondisi distonia. Distonia adalah kontraksi otot tak sadar yang menyebabkan gerakan berulang atau memutar. Botox digunakan " +"\n"+
                    "juga untuk mengobati glabellar lines, yakni garis kerut atau keriput.");
        }else if (btnObat10.getText().equals("Cefadroxil")){
            lblDeskripsiObat.setText("Cefadroxil digunakan untuk mengobati infeksi yang disebabkan oleh bakteri, contohnya infeksi pada kulit, infeksi saluran nafas, dan infeksi" +"\n"+
                    "saluran kemih. Cefadroxil termasuk kelompok antibiotik sefalosporin yang bekerja dengan cara melawan bakteri di dalam tubuh.");
        }else if (btnObat10.getText().equals("Diclofenac")){
            lblDeskripsiObat.setText("Diclofenac digunakan untuk mengobati nyeri ringan sampai sedang, atau gejala peradangan pada tulang atau peradangan pada sendi. Diclofenac " +"\n"+
                    "merupakan analgesik golongan NSAID yang bekerja dengan cara mengurangi senyawa dalam tubuh yang menyebabkan sakit dan inflamasi.");
        }else if (btnObat10.getText().equals("Estazolam")){
            lblDeskripsiObat.setText("Estazolam merupakan golongan obat benzodiazepine. Estazolam bekerja dengan cara memengaruhi senyawa kimia di otak yang kemungkinan tidak " +"\n"+
                    "seimbang dan menyebabkan gangguan tidur (insomnia). ");
        }else if (btnObat10.getText().equals("Flunarizin")){
            lblDeskripsiObat.setText("Flunarizin bekerja dengan cara memblokir senyawa kimia tertentu yang menimbulkan migrain dan gangguan pembuluh darah. Flunarizin dapat" +"\n"+
                    "menyebabkan rasa kantuk, sehingga disarankan untuk tidak mengendarai kendaraan atau mengoperasikan mesin setelah meminumnya.");
        }else if (btnObat10.getText().equals("Glycerol")){
            lblDeskripsiObat.setText("Glycerol adalah obat yang digunakan untuk meredakan gejala batuk dan konstipasi. Glycerol dalam bentuk sediaan topikal (untuk kulit) " +"\n"+
                    "digunakan untuk melembutkan serta melembapkan kulit. Sedangkan glycerol dalam bentuk tetes mata digunakan untuk menurunkan " +"\n"+
                    "tekanan bola mata pada pasien yang menderita glaukoma. Glycerol merupakan senyawa yang bersifat dehidrasi osmotik, yaitu dapat" +"\n"+
                    "menarik cairan dari luar sel untuk masuk ke dalam sel.");
        }else if (btnObat10.getText().equals("Isosorbide Dinitrate")){
            lblDeskripsiObat.setText("Isosorbid dinitrate digunakan untuk mengobati dan mencegah nyeri dada (angina) sebagai gejala serangan jantung. Tablet isosorbide dinitrate " +"\n"+
                    "sublingual sebaiknya digunakan untuk mengobati seragan angina yang sudah terjadi. Sedangkan iIsosorbide dinitrate tablet biasa " +"\n"+
                    "atau tablet lepas lambat digunakan untuk mencegah serangan angina tapi tidak dapat digunakan untuk mengobati serangan angina.");
        }else if (btnObat10.getText().equals("Levonorgestrel")){
            lblDeskripsiObat.setText("Levonorgestrel sendiri adalah obat yang memang digunakan untuk mencegah kehamilan setelah berhubungan seks tanpa kondom atau untuk kegagalan " +"\n"+
                    "usaha pencegahan lainnya, seperti kondom pecah atau melewatkan 2 atau lebih pengonsumsian pil KB.");
        }else if (btnObat10.getText().equals("Methadone")){
            lblDeskripsiObat.setText("Methadone digunakan untuk menurunkan gejala pada orang yang memiliki kecanduan heroin atau obat-obatan narkotika lainnya tanpa memberikan efek " +"\n"+
                    "high atau perasaan bahagia. Methadone digunakan pada masa rehabilitasi pecandu narkoba. Methadone merupakan obat golongan opioid " +"\n"+
                    "yang bekerja berikatan dengan reseptor opiat di sistem saraf pusat, sehingga respons akibat konsumsi narkotika akan berkurang. " +"\n"+
                    "Methadone mengurangi respons terhadap rasa sakit atau nyeri.");
        }else if (btnObat10.getText().equals("Nepafenac")){
            lblDeskripsiObat.setText("Nepafenac merupakan obat untuk mata. Obat ini berfungsi untuk menghilangkan rasa sakit dan inflamasi atau pembengkakan setelah dilakukannya " +"\n"+
                    "operasi mata. Nepafenac merupakan obat golongan NSAID yang bekerja dengan menghambat produksi prostaglandin atau senyawa yang " +"\n"+
                    "menyebabkan nyeri, inflamasi, atau bengkak.");
        }else if (btnObat10.getText().equals("Permethrin")){
            lblDeskripsiObat.setText("Permethrin digunakan untuk mengobati infeksi kulit kepala, kutu, dan kudis yang disebabkan oleh tungau yang menempel di kulit atau kutu yang " +"\n"+
                    "hidup di kulit kepala. Permethrin merupakan obat antiparasit yang menyebabkan kelumpuhan otot atau paralisis pada parasit serta " +"\n"+
                    "membunuh parasit. Obat ini bekerja dengan cara menghancurkan sel parasit tersebut.");
        }else if (btnObat10.getText().equals("Risperidone")){
            lblDeskripsiObat.setText("Risperidone digunakan untuk mengobati schizophrenia pada dewasa atau anak-anak dengan usia minimal 13 tahun. Risperidone dapat pula digunakan " +"\n"+
                    "untuk mengatasi gejala bipolar pada dewasa atau anak berusia minimal 10 tahun. Selain itu, risperidone digunakan untuk mengatasi " +"\n"+
                    "gejala autisme pada anak usia 5-16 tahun. Risperidone merupakan obat antipsikotik yang bekerja dengan cara mengubah sinyal kimia " +"\n"+
                    "yang ada di otak.");
        }else if (btnObat10.getText().equals("Sildenafil")){
            lblDeskripsiObat.setText("Sildenafil digunakan untuk mengobati disfungsi ereksi atau impotensi pada lelaki, yaitu kondisi di mana seorang pria tidak mampu ereksi atau " +"\n"+
                    "mempertahankan ereksi sehingga dapat melakukan hubungan seksual dengan pasangan dengan memuaskan. Sildenafil bekerja dengan cara " +"\n"+
                    "melemaskan otot disekitar pembuluh darah dan meningkatkan aliran darah di beberapa bagian tubuh, termasuk ke penis.");
        }else if (btnObat10.getText().equals("Terazosin")){
            lblDeskripsiObat.setText("Terazosin adalah obat yang digunakan untuk pasien hipertensi. Obat ini juga digunakan untuk mempermudah pengeluaran urine pada pria yang menderita " +"\n"+
                    "benign prostatic hyperplasia atau pembesaran prostat. Terazosin termasuk ke dalam obat golongan alpha-adrenergic blocker.");
        }else if (btnObat10.getText().equals("Vitamin B1")){
            lblDeskripsiObat.setText("Vitamin B1 atau tiamin umumnya digunakan untuk mengatasi dan mencegah kekurangan vitamin B1. Vitamin B1 dalam bentuk injeksi juga digunakan untuk " +"\n"+
                    "mengatasi beriberi dan radang saraf (neuritis). Vitamin ini juga digunakan untuk mengatasi masalah pencernaan, seperti kehilangan " +"\n"+
                    "nafsu makan, diare, dan ulcer colitis, serta gangguan otak (sindrom Wernicke-Korsakoff).");
        }
    }

    @FXML
     void btnonactionObat11(ActionEvent event) {
        if (btnObat11.getText().equals("Allylestrenol")){
            lblDeskripsiObat.setText("Allylestrenol digunakan untuk Kamu yang berisiko tinggi mengalami keguguran saat hamil, keguguran berulang, risiko persalinan prematur serta " +"\n"+
                    "mempersiapkan rahim sebelum terjadi pembuahan dan merangsang jaringan alveolar payudara untuk persiapan menyusui Struktur senyawa " +"\n"+
                    "allylestrenol bentuknya mirip dengan progesteron alami. Progesteron memiliki fungsi untuk mempersiapkan uterus menerima sel telur " +"\n"+
                    "yang sudah dibuahi dan mengurangii pergerakan otot rahim");
        }else if (btnObat11.getText().equals("Bromelain")){
            lblDeskripsiObat.setText("Bromelain dapat mengurangi pembengkakan, terutama pada hidung dan sinus, setelah operasi atau terluka. Bromelain akan membantu tubuh menghasilkan" +"\n"+
                    " senyawa yang dapat melawan nyeri dan pembengkakan.");
        }else if (btnObat11.getText().equals("Cefazolin")){
            lblDeskripsiObat.setText("Cefazolin adalah antibiotik yang digunakan untuk mengobati berbagai jenis infeksi yang disebabkan oleh bakteri, termasuk infeksi yang parah " +"\n"+
                    "dan mengancam nyawa. Obat ini juga dapat membantu mencegah infeksi pada pasien yang menjalani operasi. Cefazolin termasuk ke dalam " +"\n"+
                    "kelompok antibiotik sefalosporin yang bekerja dengan cara melawan bakteri dalam tubuh.");
        }else if (btnObat11.getText().equals("Diethylcarbamazine")){
            lblDeskripsiObat.setText("Diethylcarbamazine digunakan untuk mengobati infeksi yang disebabkan oleh cacing seperti filariasis (infeksi yang disebabkan oleh cacing filaria)," +"\n"+
                    "loiasis (infeksi yang disebabkan oleh cacing mata atau loa loa), toxocariasis (infeksi yang disebabkan oleh larva cacing gelang Toxocara canis). " +"\n"+
                    "Diethylcarbamazepine merupakan agen antelmintik (obat cacing) yang bekerja dengan cara membunuh cacing yang menginfeksi tubuh.");
        }else if (btnObat11.getText().equals("Estradiol")){
            lblDeskripsiObat.setText("wanita yang mengalami menopause bisa mengonsumsi obat estradiol. Selain dapat mengurangi gejala yang timbul saat menopause, estradiol juga dapat " +"\n"+
                    "digunakan untuk mencegah osteoporosis pada wanita yang menopause. Estradiol merupakan senyawa esterogen, yakni hormon seks pada wanita " +"\n"+
                    "yang mengontrol banyak proses dalam tubuh.");
        }else if (btnObat11.getText().equals("Fluoxetine")){
            lblDeskripsiObat.setText("Fluoxetine digunakan untuk mengatasi gangguan depresi mayor, bulimia (gangguan makan), gangguan obsesif kompulsif (kelainan psikologis yang " +"\n"+
                    "memengaruhi pikiran dan perilaku penderitanya), serangan panik, dan gangguan disforik pramenstruasi (PMS berat). Fluoxetine merupakan " +"\n"+
                    "obat yang termasuk ke dalam antidepresan golongan SSRI (Selective Serotonin Reuptake Inhibitor), yang bekerja dengan cara memperbaiki " +"\n"+
                    "senyawa kimia di otak yang tidak seimbang pada pasien yang mengalami depresi, panik, kecemasan, atau gejala obsesif kompulsif.");
        }else if (btnObat11.getText().equals("Glycopyrronium bromide")){
            lblDeskripsiObat.setText("Glycopyrronium bromide adalah obat yang digunakan untuk mengatasi tukak atau luka di lambung. Glycopyrronium bromide merupakan obat golongan " +"\n"+
                    "antikolinergik dan antimuskarinik. Obat ini bekerja dengan cara melemaskan otot dan mengurangi produksi asam lambung.");
        }else if (btnObat11.getText().equals("Isotretinoin")){
            lblDeskripsiObat.setText("Isotretinoin ini digunakan untuk mengatasi jerawat parah yang sudah tidak mempan lagi dengan pengobatan jerawat lainnya termasuk antibiotik. " +"\n"+
                    "Isotretinoin merupakan bentuk dari vitamin A yang bekerja dengan cara mengurangi jumlah minyak yang diproduksi oleh kelenjar minyak " +"\n"+
                    "pada kulit dan membantu kulit untuk beregenerasi dengan cepat.");
        }else if (btnObat11.getText().equals("Lidocaine")){
            lblDeskripsiObat.setText("Lidocaine merupakan obat anestesi lokal yang dapat mengurangi rasa sakit atau ketidaknyamanan akibat prosedur medis yang melukai jaringan, " +"\n"+
                    "seperti operasi, tusukan jarum, maupun penyisipan kateter atau tabung pernapasan. Lidocaine juga dapat digunakan untuk mengobati " +"\n"+
                    "kelainan irama jantung. Selain itu, lidocaine sering digunakan untuk mengurangi rasa sakit saat persalinan. Lidocaine bekerja dengan " +"\n"+
                    "cara memblokir perpindahan sinyal pada sistem saraf, sehingga rangsangan sakit tidak akan diterima oleh otak.");
        }else if (btnObat11.getText().equals("Methisoprinol")){
            lblDeskripsiObat.setText("Methisoprinol digunakan untuk mengobati infeksi mukokutan (berkaitan dengan selaput lendir dan kulit) akibat infeksi virus herpes dan mengobati " +"\n"+
                    "kutil kelamin. Methisoprinol merupakan obat golongan antivirus yang bekerja dengan cara merangsang sistem imun " +"\n"+
                    "(terutama cell-mediated imune) untuk melawan infeksi virus dalam tubuh.");
        }else if (btnObat11.getText().equals("Nesiritide")){
            lblDeskripsiObat.setText("Nesiritide digunakan untuk mengobati gagal jantung dekompensasi akut yang disertai gangguan pernapasan. Nesiritide dapat meningkatkan fungsi " +"\n"+
                    "pernapasan pasien dengan gagal jantung. Nesiritide bekerja dengan melemaskan dan melebarkan pembuluh darah serta menurunkan " +"\n"+
                    "tekanan darah. ");
        }else if (btnObat11.getText().equals("Phenobarbital")){
            lblDeskripsiObat.setText("Phenobarbital digunakan untuk mengobati atau mencegah kejang. Obat ini juga digunakan dalam jangka pendek sebagai obat penenang untuk membantu " +"\n"+
                    "tubuh menjadi rileks. Obat yang satu ini bekerja dengan menurunkan atau memperlambat kerja otak dan sistem saraf. ");
        }else if (btnObat11.getText().equals("Rivastigmine")){
            lblDeskripsiObat.setText("Rivastigmine merupakan obat yang digunakan untuk mengatasi demensia (gangguan berpikir dan hilang ingatan) yang disebabkan oleh Alzheimer " +"\n"+
                    "atau Parkinson. Rivastigmine bekerja dengan cara meningkatkan fungsi saraf pada otak. Obat ini mencegah pemecahan zat kimia " +"\n"+
                    "yang penting dalam proses berpikir dan mengingat.");
        }else if (btnObat11.getText().equals("Simethicone")){
            lblDeskripsiObat.setText("Simethicone digunakan untuk mengatasi rasa sakit atau tidak nyaman akibat terlalu banyak gas dalam perut dan usus. Simethicone dapat digunakan" +"\n"+
                    "untuk bayi, anak dan dewasa. Simethicone bekerja dengan cara mendorong gas dalam lambung dan usussecara bersamaan sehingga gas " +"\n"+
                    "dapat lebih mudah melewati bagian tubuh, tidak tertahan di organ tertentu.");
        }else if (btnObat11.getText().equals("Terbinafine")){
            lblDeskripsiObat.setText("Terbinafine adalah obat yang digunakan untuk mengobati infeksi kulit, seperti athlete's foot (kurap kaki atau infeksi jamur pada permukaan kaki), " +"\n"+
                    "jock itch (infeksi jamur pada kulit bagian paha dalam, sekitar kelamin, dan bokong), atau ringworm (infeksi jamur di kulit). " +"\n"+
                    "Terbinafine termasuk ke dalam obat golongan antifungi atau antijamur. Obat ini bekerja dengan cara melawan infeksi akibat " +"\n"+
                    "jamur atau fungi.");
        }else if (btnObat11.getText().equals("Vitamin B12")){
            lblDeskripsiObat.setText("Vitamin B12 atau sianokobalamin adalah vitamin yang digunakan untuk orang yang memiliki kekurangan vitamin B12. Obat ini juga digunakan untuk " +"\n"+
                    "mengobati pernicious anemia (penurunan sel darah merah yang terjadi ketika tubuh tidak dapat dengan baik menyerap vitamin B12 " +"\n"+
                    "dari saluran pencernaan). Vitamin B12 penting untuk pertumbuhan dan reproduksi sel. Selain itu, obat ini juga berperan penting" +"\n"+
                    "dalam pembentukan sel darah, protein dan pembentukan (sintesis) jaringan.");
        }
    }

    @FXML
     void btnonactionObat12(ActionEvent event) {
        if (btnObat12.getText().equals("Alpha-Lipoic Acid")){
            lblDeskripsiObat.setText("Alpha-Lipoic Acid (ALA) adalah obat yang efektif digunakan untuk perawatan kulit dari dalam. Manfaatnya mulai dari mencegah penuaan " +"\n"+
                    "kulit, memperbaiki elastisitas kulit, mengurangi kerutan, dan kulit kasar akibat penuaan kulit. Alpha-Lipoic Acid (ALA) " +"\n"+
                    "berfungsi sebagai antioksidan.");
        }else if (btnObat12.getText().equals("Bromhexine")){
            lblDeskripsiObat.setText("Bromhexine memiliki efek untuk meningkatkan pengeluaran dahak dengan cara mengurangi kekentalan dahak dan merangsang tenggorokan " +"\n"+
                    "untuk mendorong dahak keluar. Selain efek yang diinginkan, bromhexine juga memiliki efek samping yang tidak diinginkan. " +"\n"+
                    "Segera hubungi dokter apabila efek samping muncul, menetap, bahkan memburuk.");
        }else if (btnObat12.getText().equals("Cefepime")){
            lblDeskripsiObat.setText("Cefepime adalah antibiotik yang digunakan untuk mengobati berbagai infeksi yang disebabkan oleh bakteri, termasuk infeksi parah yang " +"\n"+
                    "mengancam nyawa. Cefepime termasuk ke dalam kelompok antibiotik sefalosporin yang bekerja dengan cara melawan bakteri " +"\n"+
                    "dalam tubuh. ");
        }else if (btnObat12.getText().equals("Digoxin")){
            lblDeskripsiObat.setText("Digoxin digunakan untuk mengobati gagal jantung. Selain itu, obat ini juga digunakan untuk mengobati denyut jantung tidak teratur " +"\n"+
                    "atau terlalu cepat yang umumnya menyebabkan aliran darah tidak lancar (fibrilasi atrial). Digoxin merupakan obat yang " +"\n"+
                    "berasal dari ekstrak daun tanaman digitalis yang membantu jantung untuk berdetak lebih kuat dengan ritme denyut jantung " +"\n"+
                    "yang lebih teratur.");
        }else if (btnObat12.getText().equals("Estrogen")){
            lblDeskripsiObat.setText("Estrogen digunakan untuk mengatasi gejala menopause pada wanita, seperti vagina menjadi kering dan hot flashes (rasa panas disertai " +"\n"+
                    "keringat dan detak jantung yang cepat). Estrogen juga dapat digunakan untuk mencegah keropos tulang atau osteoporosis " +"\n"+
                    "pada wanita. Estrogen merupakan hormon seks alami pada wanita yang dihasilkan oleh ovarium. Estrogen dibutuhkan untuk " +"\n"+
                    "banyak proses dalam tubuh.");
        }else if (btnObat12.getText().equals("Fluphenazine")){
            lblDeskripsiObat.setText("Fluphenazine merupakan obat antipsikotik yang termasuk ke dalam golongan obat phenothiazine. Obat ini bekerja dengan cara mengubah " +"\n"+
                    "aksi senyawa kimia di otak. ");
        }else if (btnObat12.getText().equals("Granisetron")){
            lblDeskripsiObat.setText("Granisetron adalah obat yang digunakan untuk mencegah mual dan muntah yang disebabkan oleh pengobatan kanker. Pengobatan kanker " +"\n"+
                    "yang dimaksud adalah kemoterapi atau radiasi. Granisetron bekerja dengan cara menghambat senyawa kimia tertentu dalam " +"\n"+
                    "tubuh yang dapat menyebabkan mual dan muntah.");
        }else if (btnObat12.getText().equals("Isoxsuorine HCI")){
            lblDeskripsiObat.setText("Isoxsuorine HCl adalah obat yang digunakan untuk mengatasi gejala gangguan pembuluh darah di daerah kepala " +"\n"+
                    "(aliran darah ke otak tidak lancar), arteriosclerosis (penebalan pembuluh darah arteri), dan kondisi lain yang menyebabkan " +"\n"+
                    "aliran darah ke pembuluh vena dan arteri menjadi kurang baik. Isoxsuprine merupakan obat golongan vasodilator. Obat ini bekerja " +"\n"+
                    "dengan cara melemaskan pembuluh darah vena dan arteri, sehingga pembuluh darah menjadi lebih lebar dan mempermudah aliran darah. ");
        }else if (btnObat12.getText().equals("Lincomycin")){
            lblDeskripsiObat.setText("Lincomycin digunakan untuk mengobati penyakit yang disebabkan oleh infeksi bakteri. Lincomycin biasanya digunakan pada pasien " +"\n"+
                    "yang tidak dapat menggunakan atau memiliki alergi terhadap penisilin. Lincomycin merupakan obat golongan antibiotik yang " +"\n"+
                    "bekerja dengan cara melawan bakteri dalam tubuh.");
        }else if (btnObat12.getText().equals("Methotrexate")){
            lblDeskripsiObat.setText("Metotrexate biasanya diberikan sebagai obat tambahan jika obat sebelumnya tidak dapat meredakan gejala. Methotrexate merupakan obat " +"\n"+
                    "yang digunakan untuk mengganggu pertumbuhan sel-sel tertentu dari tubuh, khususnya sel-sel yang berkembang biak dengan cepat, " +"\n"+
                    "seperti sel kanker, sumsum tulang, dan kulit. Obat ini digunakan untuk mengobati berbagai jenis keganasan seperti kanker payudara, " +"\n"+
                    "kulit, kepala dan leher, atau paru-paru tertentu. Selain itu, methotrexate juga digunakan untuk mengobati psoriasis berat " +"\n"+
                    "(peradangan kulit) dan rheumatoid arthritis (peradangan sendi).");
        }else if (btnObat12.getText().equals("Nicardipine")){
            lblDeskripsiObat.setText("Nicardipine digunakan untuk mengobati hipertensi (tekanan darah tinggi) dan angina (nyeri dada akibat kurangnya darah dan oksigen yang " +"\n"+
                    "menuju jantung). Nicardipine merupakan obat antihipertensi golongan CCB (calcium channel blocker). Cara kerjanya adalah dengan " +"\n"+
                    "merelaksasi atau melemaskan pembuluh darah, sehingga jantung lebih mudah memompa darah dan meringankan kerja jantung.");
        }else if (btnObat12.getText().equals("Phenylbutazone")){
            lblDeskripsiObat.setText("Phenylbutazone merupakan obat peresa nyeri atau painkiller. Obat ini digunakan untuk mengurangi rasa nyeri dan peradangan yang " +"\n"+
                    "disebabkan oleh penyakit ankylosing spondylitis. Ini adalah penyakit kronis yang menyebabkan tulang belakang mengalami peradangan. ");
        }else if (btnObat12.getText().equals("Ropinirole")){
            lblDeskripsiObat.setText("Ropinirole digunakan untuk mengobati gejala penyakit Parkinson (kram, tremor, kejang otot, kontrol otot yang lemah). Ropinirole juga digunakan" +"\n"+
                    " untuk mengatasi penyakit Willis-Ekbom (kondisi neurologis ketika kaki tidak terkontrol untuk bergerak).");
        }else if (btnObat12.getText().equals("Simvastatin")){
            lblDeskripsiObat.setText("Simvastatin digunakan untuk menurunkan kolesterol dan trigliserida dalam darah. Simvastatin juga dapat menurunkan risiko stroke, serangan " +"\n"+
                    "jantung dan komplikasi jantung lainnya pada pasien diabetes dan penyakit jantung koroner. Simvastatin merupakan obat golongan statin, " +"\n"+
                    "yang bekerja dengan cara menurunkan kolesterol jahat yakni LDL dan trigliserida dan meningkatkan kolesterol baik yakni HDL");
        }else if (btnObat12.getText().equals("Terbutaline")){
            lblDeskripsiObat.setText("Terbutalin adalah obat yang digunakan untuk mengobati atau mencegah bronkospasme. Bronkospasme sendiri adalah kondisi sesak napas atau kesulitan" +"\n"+
                    " bernapas pada penderita asma, bronkitis, dan emfisema (kondisi kantong udara di paru-paru hancur secraa bertahap dan menyebabkan " +"\n"+
                    "napas lebih pendek). Terbutaline merupakan bronkodilator (agonis beta-2 reseptor). Obat ini bekerja dengan cara melemaskan otot " +"\n"+
                    "paru-paru dan membuka saluran pernapasan, supaya penderita bisa bernapas dengan lebih lancar.");
        }else if (btnObat12.getText().equals("Vitamin B2")){
            lblDeskripsiObat.setText("Vitamin B2 atau riboflavin digunakan untuk mengatasi dan mencegah kondisi rendah riboflavin (vitamin B2) pada orang-orang yang tidak mendapatkan " +"\n"+
                    "asupan cukup vitamin ini dari diet sehari-hari. Vitamin B2 sangat penting dalam menjaga dan memperbaiki berbagai jaringan dalam " +"\n"+
                    "tubuh. Vitamin ini menjaga kulit, mata, saraf, dan sel darah merah agar tetap sehat.");
        }
    }

    @FXML
     void btnonactionObat13(ActionEvent event) {
        if (btnObat13.getText().equals("Alprazolam")){
            lblDeskripsiObat.setText("Alprazolam digunakan untuk terapi gangguan kecemasan jangka pendek, dan sebagai terapi untuk Kamu yang mengalami gangguan serangan panik. " +"\n"+
                    "Alprazolam termasuk ke dalam golongan senyawa benzodiazepine dan bekerja di sistem saraf pusat otak dengan cara mengurangi " +"\n"+
                    "rangsangan abnormal pada otak sehingga memiliki efek penenang.");
        }else if (btnObat13.getText().equals("Bromocriptine")){
            lblDeskripsiObat.setText("Bromokriptin adalah obat yang digunakan untuk terapi penyakit-penyakit akibat ketidakseimbangan hormon, ketika prolaktin yang ada di dalam " +"\n"+
                    "darah terlalu banyak (hiperprolaktinemia). Bromokriptin atau agonis dopamine D2 adalah obat untuk mengaktifkan reseptor dopamin" +"\n"+
                    "prostsinapsis pada jalur tuberoinfundibular dari hipotalamus ke kelenjar dopamin, yang menghambat sekresi dan prolaktin dari " +"\n"+
                    "pituitari anterior. Obat ini juga dapat menurunkan kadar hormon pertumbuhan dalam darah. Selain itu, Bromokriptin dapat " +"\n"+
                    "menstimulasi jalur nigrostriatal pada korpus striatum, sehingga berdampak pada peningkatan kontrol koordinasi gerak tubuh.");
        }else if (btnObat13.getText().equals("Cefidinir")){
            lblDeskripsiObat.setText("Cefidinir adalah antibiotik yang digunakan untuk mengatasi berbagai jenis infeksi yang disebabkan oleh bakteri. Cefdinir merupakan antibiotik " +"\n"+
                    "dari golongan cephalosporin. Sama seperti antibiotik pada umumnya, obat ini bekerja dengan cara melawan bakteri dalam tubuh.");
        }else if (btnObat13.getText().equals("Diltiazem")){
            lblDeskripsiObat.setText("Diltiazem digunakan untuk mengobati hipertensi, angina (nyeri dada), dan gangguan ritme pada jantung. Diltiazem merupakan obat golongan " +"\n"+
                    "calcium channel blocker, yang bekerja dengan cara melemaskan otot jantung dan pembuluh darah.");
        }else if (btnObat13.getText().equals("Ethambutol")){
            lblDeskripsiObat.setText("Ethambutol digunakan untuk mengobati tuberculosis (TB). Umumnya, obat ini digunakan bersamaan dengan minimal satu obat TB lain. Ethambutol " +"\n"+
                    "merupakan antibiotik yang mencegah pertumbuhan bakteri tuberkulosis dalam tubuh.");
        }else if (btnObat13.getText().equals("Fluvoxamine")){
            lblDeskripsiObat.setText("Fluvoxamine digunakan untuk mengobati gangguan kecemasan sosial (social phobia) atau gangguan obsesif-kompulsif, yang disertai dengan " +"\n"+
                    "pemikiran dan perilaku yang berulang. Fluvoxamine merupakan obat antidepresan golongan SSRI (selective serotonin reuptake inhibitor), " +"\n"+
                    "yang bekerja dengan cara menyeimbangkan senyawa kimia di otak pasien yang mengalami gejala obsesif-kompulsif.");
        }else if (btnObat13.getText().equals("Griseofulvin")){
            lblDeskripsiObat.setText("Griseofulvin digunakan untuk mengobati dermatofitosis, penyakit jamur golongan dermatofita pada jaringan yang mengandung zat tanduk, " +"\n"+
                    "seperti kuku, rambut, dan stratum korneum pada epidermis.  Griseofulvin bekerja dengan cara membantu pembentukan kulit, rambut, " +"\n"+
                    "dan kuku baru untuk melawan serangan yang disebabkan oleh jamur. Saat jaringan yang baru tumbuh, jaringan yang lama dan terinfeksi " +"\n"+
                    "akan terlepas. Pengobatan harus tetap dilanjutkan sampai jaringan lama yang terinfeksi benar-benar telah hilang.");
        }else if (btnObat13.getText().equals("Isradipine")){
            lblDeskripsiObat.setText("Sama seperti penyakit diabetes, hipertensi juga bukanlah kondisi yang dapat disembuhkan. Namun, dengan perbaikan pola hidup dan " +"\n"+
                    "pengobatan yang tepat, tekanan darah dapat lebih terkontrol sehingga risiko komplikasi bisa lebih dikurangi. Salah satu " +"\n"+
                    "jenis obat yang umum digunakan dalam pengobatan pasien hipertensi atau darah tinggi adalah isradipine. Isradipine " +"\n"+
                    "merupakan obat yang termasuk ke dalam golongan calcium channel blocker yang bekerja dengan cara merelaksasi jantung " +"\n"+
                    "dan pembuluh darah.");
        }else if (btnObat13.getText().equals("Lisinopril")){
            lblDeskripsiObat.setText("Hipertensi bukan kondisi yang dapat disembuhkan, dengan perbaikan gaya hidup dan perawatan yang tepat, tekanan darah bisa lebih " +"\n"+
                    "dikontrol sehingga risiko komplikasi pun dapat dikurangi. Salah satu obat yang umum digunakan dalam perawatan pasien " +"\n"+
                    "hipertensi adalah lisinopril. Lisinopril merupakan obat golongan ACE (angiotensin-converting-enzyme) inhibitor. Lisinopril " +"\n"+
                    "akan menurunkan tekanan darah dengan cara menghambat perubahan angiotensin I menjadi angiotensin II, yang berfungsi untuk " +"\n"+
                    "meningkatkan tekanan darah.");
        }else if (btnObat13.getText().equals("Methylcobalamin")){
            lblDeskripsiObat.setText("Methylcobolamin atau disebut juga dengan mecobalamin merupakan salah satu bentuk kimia dari vitamin B12 yang memiliki banyak sekali " +"\n"+
                    "fungsi. Vitamin B12 berperan dalam pembentukan sel darah merah, metabolisme sel, tubuh, dan juga saraf. Methycobolamin " +"\n"+
                    "juga digunakan untuk mengobati kerusakan pada saraf perifer atau saraf tepi yang sering menyebabkan keluhan, seperti lemah, " +"\n"+
                    "rasa baal, atau nyeri terutama pada tangan dan kaki (neuropati perifer). Methylcobalamin merupakan salah satu vitamin B12 " +"\n"+
                    "yang larut dalam air di dalam tubuh. Methylcobalamin meningkatkan produksi sel darah merah dengan merangsang pembentukkan " +"\n"+
                    "asam nukleat di sumsum tulang dan merangsang agar sel darah merah (eritrosit) lebih matang. Methycobalamin melindungi dan " +"\n"+
                    "meregenerasi saraf yang rusak dan dapat bekerja bersama-sama dengan folat dalam DNA sintesis.");
        }else if (btnObat13.getText().equals("Nicorandil")){
            lblDeskripsiObat.setText("Nicorandil digunakan untuk mengobati nyeri dada akibat kurangnya darah dan oksigen yang menuju jantung (angina pektoris). Nicoradil " +"\n"+
                    "melebarkan diameter (vasodilatasi) pembuluh darah arteri dan arteri koroner, serta meningkatkan aliran darah ke jantung.");
        }else if (btnObat13.getText().equals("Phenylephrine")){
            lblDeskripsiObat.setText("Phenylephrine digunakan untuk mengobati hidung tersumbat dan sinus. Obat ini juga digunakan oleh penderita wasir dan miadriasis " +"\n"+
                    "(pelebaran pupil mata yang berlebihan). Phenylephrine adalah dekongestan yang menyusutkan pembuluh darah di saluran hidung. " +"\n"+
                    "Pembuluh darah yang melebar dapat menyebabkan hidung tersumbat.");
        }else if (btnObat13.getText().equals("Rosuvastatin")){
            lblDeskripsiObat.setText("Rosuvastatin digunakan untuk dewasa dan anak minimal 8 tahun untuk menurunkan kolesterol dan trigliserida (salah satu tipe lemak) " +"\n"+
                    "dalam darah, serta menurunkan jumlah lemak yang menempel pada pembuluh darah. Rosuvastatin digunakan pula untuk menurunkan " +"\n"+
                    "risiko stroke, serangan jantung dan komplikasi jantung dengan diabetes, serta penyakit jantung koroner dan faktor risiko " +"\n"+
                    "lainnya. Rosuvastatin merupakan obat golongan statin. Rosuvastatin bekerja dengan menurunkan jumlah lemak jahat seperti LDL, " +"\n"+
                    "trigliserida, dan meningkatkan jumlah lemak baik seperti HDL.");
        }else if (btnObat13.getText().equals("Spiramycin")){
            lblDeskripsiObat.setText("Spiramycin digunakan untuk infeksi protozoa, toxoplasmosis, cryptosporidiosis (diare akibat protozoa cryptosopridium), dan pasien yang " +"\n"+
                    "rentan dengan infeksi. Spiramycin merupakan antibiotik golongan makrolida yang bekerja dengan mencegah pertumbuhan bakteri " +"\n"+
                    "atau protozoa tertentu.");
        }else if (btnObat13.getText().equals("Testosterone")){
            lblDeskripsiObat.setText("Testosterone adalah hormon yang memiliki peran penting di dalam tubuh wanita maupun pria. Dalam bentuk obat, testosterone digunakan " +"\n"+
                    "pada orang yang memiliki kekurangan hormon tersebut. Selain itu, testoteron juga digunakan untuk mengobati kanker payudara " +"\n"+
                    "pada wanita yang telah menyebar ke bagian tubuh lain. Testosterone digunakan untuk dengan cara meningkatkan jumlah hormon " +"\n"+
                    "ini dalam tubuh.");
        }else if (btnObat13.getText().equals("Vitamin B3 (Niacin)")){
            lblDeskripsiObat.setText("Vitamin B3 (niacin) digunakan untuk mencegah dan mengobati kondisi kekurangan niacin alami dalam tubuh, serta untuk menurunkan kolesterol " +"\n"+
                    "dan trigliserida dalam darah. Niacin juga digunakan untuk menurunkan risiko serangan jantung pada orang dengan kadar " +"\n"+
                    "kolesterol tinggi dan pernah mengalami serangan jantung sebelumnya. Terkadang, niacin digunakan untuk terapi pasien penyumbatan " +"\n"+
                    "pada arteri koroner jantung. Niacin dan niacinamid dibutuhkan tubuh untuk menjaga fungsi dari lemak dan gula dalam tubuh. " +"\n"+
                    "Selain itu, vitamin ini juga menjaga sel agar tetap sehat.");
        }
    }

    @FXML
     void btnonactionObat14(ActionEvent event) {
        if (btnObat14.getText().equals("Aluminium Hidroksida")){
            lblDeskripsiObat.setText("Aluminium hidroksida ini adalah obat sakit lambung atau maag. Dia adalah golongan antasida untuk menetralkan asam lambung yang berlebih, " +"\n"+
                    "mengobati luka atau tukak lambung, dan gastritis (iritasi lambung).");
        }else if (btnObat14.getText().equals("Brompheniramine")){
            lblDeskripsiObat.setText("Brompheniramine adalah obat yang digunakan untuk mengatasi hidung berair, bersin, gatal, serta mata berair akibat alergi, pilek, atau flu.");
        }else if (btnObat14.getText().equals("Cefixime")){
            lblDeskripsiObat.setText("Cefixime adalah antibiotik yang digunakan untuk mengobati berbagai infeksi yang disebabkan bakteri, termasuk infeksi parah yang mengancam nyawa.");
        }else if (btnObat14.getText().equals("Dimenhydrinate")){
            lblDeskripsiObat.setText("Dimenhydrinate digunakan untuk mengobati atau mencegah mual, muntah, dan kepala terasa berputar yang disebabkan oleh mabuk perjalanan. " +"\n"+
                    "Dimenhydrinate merupakan antihistamin yang bekerja dengan cara mengurangi efek histamin alami yang ada dalam tubuh.");
        }else if (btnObat14.getText().equals("Etodolac")){
            lblDeskripsiObat.setText("Etodolac digunakan untuk mengatasi nyeri ringan hingga sedang, osteoarthritis atau rheumatoid arthritis. Etodolac merupakan obat golongan " +"\n"+
                    "NSAID (nonsteroidal anti-inflammatory drug) yang bekerja menurunkan pelepasan hormon yang menyebabkan peradangan dan " +"\n"+
                    "rasa nyeri pada tubuh.");
        }else if (btnObat14.getText().equals("Fondaparinux")){
            lblDeskripsiObat.setText("Fondaparinux adalah obat yang digunakan untuk mencegah pembekuan darah yang disebut deep vein thrombosis atau DVT (gumpalan darah yang " +"\n"+
                    "terbentuk pada vena dalam tubuh). DVT dapat memicu pembekuan darah pada paru-paru (emboli paru). DVT biasanya terjadi " +"\n"+
                    "setelah menjalani beberapa operasi tertentu. Fondaparinux dapat menghambat aktivitas senyawa tertentu yang dapat " +"\n"+
                    "menyebabkan pembekuan darah.");
        }else if (btnObat14.getText().equals("Guaifenesin")){
            lblDeskripsiObat.setText("Guaifenesin merupakan expectorant yang bekerja dengan cara melegakan sumbatan pada dada dan tenggorokan, sehingga mempermudah dahak " +"\n"+
                    "dikeluarkan melalui mulut. ");
        }else if (btnObat14.getText().equals("Itraconazole")){
            lblDeskripsiObat.setText("Itraconazole digunakan untuk mengobati infeksi jamur yang menyerang berbagai bagian tubuh seperti paru-paru, mulut atau tenggorokan, " +"\n"+
                    "kuku jari kaki atau kuku jari tangan. Itraconazole merupakan obat antijamur yang bekerja dengan cara melawan " +"\n"+
                    "infeksi yang disebabkan oleh jamur.");
        }else if (btnObat14.getText().equals("Lithium")){
            lblDeskripsiObat.setText("Lithium digunakan untuk mengobati penyakit bipolar (perubahan suasana hati secara drastis), mania, dan depresi. Gejala yang timbul " +"\n"+
                    "seperti hiperaktif, bicara terburu-buru, gangguan tidur, agresif, dan emosi tidak stabil. Lithium memengaruhi " +"\n"+
                    "aliran ion natrium melalui sel saraf dan sel otot di dalam tubuh.");
        }else if (btnObat14.getText().equals("Methylprednisolone")){
            lblDeskripsiObat.setText("Methylprednisolone adalah obat dari golongan steroid yang digunakan untuk mengobati berbagai kondisi peradangan seperti radang sendi, " +"\n"+
                    "lupus, psoriasis (peradangan kulit), kolitis ulseratif (peradangan pada usus besar dan rektum), kelainan alergi, " +"\n"+
                    "gangguan kelenjar (endokrin), dan kondisi yang mempengaruhi kulit, mata, paru-paru, perut, sistem saraf, atau sel darah.");
        }else if (btnObat14.getText().equals("Nicotinamide")){
            lblDeskripsiObat.setText("Nicotinamide atau biasa juga disebut dengan niacinamide digunakan untuk mencegah defisiensi niasin (vitamin B3). Nicotinamide merupakan " +"\n"+
                    "turunan vitamin B3 dan memiliki aktivitas anti-inflamasi (antiradang).");
        }else if (btnObat14.getText().equals("Phenylpropanolamine")){
            lblDeskripsiObat.setText("Phenylpropanolamine digunakan untuk mengobati hidung tersumbat. Phenylpropanolamine adalah dekongestan hidung, yang bekerja memperkecil " +"\n"+
                    "diameter pembuluh darah di saluran hidung. Pasalnya, pembuluh darah yang melebar dapat menyebabkan hidung tersumbat.");
        }else if (btnObat14.getText().equals("Spironolactone")){
            lblDeskripsiObat.setText("Spironolactone digunakan untuk mengobati penyakit jantung, tekanan darah tinggi, penurunan kalium dalam darah (hipokalemia). Spironolacton " +"\n"+
                    "juga dapat digunakan untuk mengurangi retensi cairan (penumpukan cairan) pada pasien gagal jantung kongestif, " +"\n"+
                    "sirosis hati, atau gangguan ginjal. Pada pasien dengan hormon aldosterone melebihi normal, dapat diobati pula " +"\n"+
                    "dengan spironolactone.");
        }else if (btnObat14.getText().equals("Tetracycline")){
            lblDeskripsiObat.setText("Tetracycline digunakan untuk mengatasi berbagai infeksi bakteri pada kulit, usus, saluran pernapasan, saluran perkemihan, alat kelamin, " +"\n"+
                    "kelenjar limpa dan sistem tubuh lainnya. Tetracycline juga sering digunakan untuk mengobati jerawat yang berat " +"\n"+
                    "atau penyakit seksual seperti sifilis (raja singa), klamidia dan gonore (kencing nanah). Tetrasiklin juga dapat " +"\n"+
                    "mengobati infeksi akibat kontak langsung dengan hewan atau makanan yang terkontaminasi");
        }else if (btnObat14.getText().equals("Vitamin B5")){
            lblDeskripsiObat.setText("Vitamin B5 atau asam pantotenat digunakan pada pasien yang kekurangan vitamin ini. Vitamin ini bisa ditemukan di tumbuhan maupun binatang, " +"\n"+
                    "termasuk sereal gandum, telur, dan susu.");
        }
    }

    @FXML
    void btnonactionObat15(ActionEvent event) {
        if (btnObat15.getText().equals("Ambroxol")){
            lblDeskripsiObat.setText("Ambroxol termasuk obat mukolitik, atau pengencer dahak yang termasuk metabolit bromhexine. Sebagai agen mukolitik, ambroxol bekerja dengan " +"\n"+
                    "cara memecah serat asam mukopolisakarida yang membuat dahak lebih encer dan mengurangi penumpukan lendir pada " +"\n"+
                    "dinding tenggorokan sehingga mempermudah pengeluaran lendir saat batuk.");
        }else if (btnObat15.getText().equals("Budesonide")){
            lblDeskripsiObat.setText("Budesonide adalah obat yang digunakan untuk mengobati beberapa penyakit usus, seperti Crohn's disease (radang usus kronis) dan koalitis " +"\n"+
                    "ulseratif (radang kronis pada usus besar). bat ini termasuk obat golongan steroid yang bekerja dengan cara " +"\n"+
                    "mengurangi peradangan pada tubuh.");
        }else if (btnObat15.getText().equals("Cefoperazone")){
            lblDeskripsiObat.setText("Cefoperazone adalah antibiotik yang digunakan untuk mengobati infeksi akibat bakteri pada beberapa bagian tubuh yang berbeda.");
        }else if (btnObat15.getText().equals("Dimethicone")){
            lblDeskripsiObat.setText("Dimethicone digunakan untuk mengobati pedikulosis (infestasi kutu kepala) dan digunakan sebagai pelindung kulit. Dimethicone dapat bekerja " +"\n"+
                    "dengan cara melembapkan, meningkatkan kadar air, dan melindungi kulit.");
        }else if (btnObat15.getText().equals("Etoricoxib")){
            lblDeskripsiObat.setText("Etoricoxib digunakan untuk mengurangi rasa nyeri dan pembengkakan (inflamasi) sendi serta otot pada orang yang menderita osteoarthritis " +"\n"+
                    "(pengapuran sendi), rheumatoid arthritis (peradangan kronis pada sendi akibat autoimun), ankylosing spondylitis " +"\n"+
                    "(peradangan pada tulang belakang), dan gout (peradangan pada sendi akibat asam urat berlebih).");
        }else if (btnObat15.getText().equals("Formaldehyde")){
            lblDeskripsiObat.setText("Formaldehyde digunakan untuk mengobati kutil yang terasa mengganggu. Kutil sendiri sebenarnya tergolong sebagai tumor jinak yang disebabkan " +"\n"+
                    "oleh virus. Kebanyakan penyebab kutil adalah Human Papilloma Virus (HPV). Virus ini akan menginfeksi lapisan atas " +"\n"+
                    "kulit dan pertumbuhannya termasuk cepat. Nah, selain mengobati kutil, formaldehyde juga dapat digunakan untuk " +"\n"+
                    "mengatasi bau kaki dan keringat berlebih pada kaki.");
        }else if (btnObat15.getText().equals("Ivermectin")){
            lblDeskripsiObat.setText("Ivermectin digunakan untuk mengobati infeksi dalam tubuh yang disebabkan oleh parasit tertentu. Ivermectin merupakan jenis obat antiparasit.");
        }else if (btnObat15.getText().equals("Loperamide")){
            lblDeskripsiObat.setText("Loperamide menurunkan gerak peristaltik (gerakan yang terjadi pada otot-otot pada saluran pencernaan), sehingga usus halus memiliki banyak " +"\n"+
                    "waktu untuk menyerap cairan dan nutrisi dari makanan. Selain dapat mengobati diare, loperamide juga memiliki " +"\n"+
                    "beberapa efek samping yang perlu diperhatikan, seperti sembelit, pusing, mengantuk, mual, dan kram perut.");
        }else if (btnObat15.getText().equals("Metil Salisilat")){
            lblDeskripsiObat.setText("Metil salisilat merupakan obat yang digunakan untuk menghilangkan nyeri otot atau sendi. Obat ini cocok untuk mengurangi nyeri yang " +"\n"+
                    "disebabkan oleh ketegangan, keseleo, radang sendi, memar, atau sakit punggung.");
        }else if (btnObat15.getText().equals("Nifedipine")){
            lblDeskripsiObat.setText("Nifedipine merupakan antihipertensi dari obat golongan calcium channel blocker (CCB). Obat ini bekerja dengan merelaksasi atau melemaskan " +"\n"+
                    "pembuluh darah dan otot jantung. Dengan begitu, darah pun dapat mengalir lebih mudah.");
        }else if (btnObat15.getText().equals("Phenytoin")){
            lblDeskripsiObat.setText("Phenytoin adalah obat yang digunakan untuk mengontrol atau mengendalikan kejang. Phenytoin termasuk obat anti-epliepsi atau obat antikonvulsan " +"\n"+
                    "yang bekerja dengan memperlambat impuls di otak yang menyebabkan kejang.");
        }else if (btnObat15.getText().equals("Squalene")){
            lblDeskripsiObat.setText("Squalene adalah suplemen yang terbuat dari minyak hati ikan hiu dan minyak zaitun. Obat ini umumnya dikonsumsi penderita kanker karena " +"\n"+
                    "mengandung senyawa anti-kanker. Selain itu, obat ini juga terbukti menyehatkan, serta dapat menurunkan kadar kolesterol, " +"\n"+
                    "lemak buruk 'LDL' dan trigliserida. Pada umumnya, squalene juga dikombinasikan di produk perawatan kulit dalam bentuk " +"\n"+
                    "pelembap karena mengandung antioksidan.");
        }else if (btnObat15.getText().equals("Thalimode")){
            lblDeskripsiObat.setText("Thalidomide adalah obat yang digunakan bersama dengan dexamethasone untuk mengatasi kanker sum-sum tulang belakang (multiple myeloma). " +"\n"+
                    "Obat ini juga dapat mengatasi dan mencegah lesi kulit (kerusakan/abnormal kulit) akibat leprosi ada penyaki Hansen.");
        }else if (btnObat15.getText().equals("Vitamin B6")){
            lblDeskripsiObat.setText("Vitamin B6 atau dikenal dengan piridoksin digunakan untuk mengatasi dan mencegah kekurangan (defisiensi) vitamin B6 dan sideroblastik " +"\n"+
                    "anemia. Piridoksin dalam bentuk injeksi bisa diberikan kepada bayi untuk mengatasi kekejangan.");
        }
    }

    @FXML
    void btnonactionObat16(ActionEvent event) {
        if (btnObat16.getText().equals("Amikacin")){
            lblDeskripsiObat.setText("Amikacin adalah antibiotik yang digunakan untuk infeksi serius yang disebabkan oleh bakteri. Amikacin merupakan antibiotik golongan " +"\n"+
                    "aminoglikosida yang memiliki spektrum luas, artinya dapat membunuh banyak jenis bakteri, terutama bakteri gram negatif");
        }else if (btnObat16.getText().equals("Bupivacaine")){
            lblDeskripsiObat.setText("Bupivacaine adalah obat anestesi yang disuntikkan di tulang belakang. Ini berguna untuk membuat pasien menjadi mati rasa atau tidak " +"\n"+
                    "merasakan sakit saat operasi Caesar dan sejumlah prosedur medis lain. Bupivacaine juga bisa digunakan sebagai anestesi " +"\n"+
                    "pada operasi gigi.");
        }else if (btnObat16.getText().equals("Cefotaxim")){
            lblDeskripsiObat.setText("Cefotaxime adalah antibiotik yang digunakan untuk mengobati berbagai infeksi, termasuk infeksi yang mengancam jiwa. ");
        }else if (btnObat16.getText().equals("Diphenhydramine")){
            lblDeskripsiObat.setText("Diphenhydramin digunakan untuk mengobati bersin-bersin, hidung berair, mata berair, bentol-bentol, kulit kemerahan, dan gejala pilek " +"\n"+
                    "atau alergi lainnya. Obat ini dapat juga digunakan untuk mengobati mabuk perjalanan, merangsang tidur, dan mengobati " +"\n"+
                    "gejala tertentu dari penyakit Parkinson.");
        }else if (btnObat16.getText().equals("Fosinopril")){
            lblDeskripsiObat.setText("Fosinopril digunakan untuk mengatasi tekanan darah tinggi atau hipertensi dan gagal jantung. Fosinopril merupakan obat antihipertensi " +"\n"+
                    "dari golongan ACEI (Angiotensin converting enzim inhibitor) yang merupakan enzim yang dapat memengaruhi peningkatan " +"\n"+
                    "tekanan darah.");
        }else if (btnObat16.getText().equals("Loratadine")){
            lblDeskripsiObat.setText("Loratadine adalah obat yang digunakan untuk mengurangi gejala bersin-bersin, hidung berair, mata berair, gatal-gatal, ruam kulit, gatal, " +"\n"+
                    "dan gejala pilek atau alergi lainnya. Loratadine juga dapat digunakan untuk mengobati gatal-gatal kulit dan gatal pada " +"\n"+
                    "orang dengan reaksi kulit kronis.");
        }else if (btnObat16.getText().equals("Metildopa")){
            lblDeskripsiObat.setText("Metildopa merupakan obat yang digunakan untuk mengobati hipertensi (tekanan darah tinggi). Ini akan mengurangi zat kimia tertentu dalam " +"\n"+
                    "darah, yang memungkinkan pembuluh darah (arteri dan vena) lebih rileks serta membuat jantung bekerja lebih lambat dan mudah.");
        }else if (btnObat16.getText().equals("Nifuroxazide")){
            lblDeskripsiObat.setText("Nifuroxazide termasuk ke dalam golongan obat antibiotik. Antibiotik ini biasanya digunakan untuk mengobati kolitis (peradangan usus besar) " +"\n"+
                    "dan diare karena infeksi bakteri. Nifuroxazide merupakan agen antiinfeksi usus spektrum luas, artinya dapat membunuh berbagai " +"\n"+
                    "jenis bakteri. Obat yang tergolong antibiotik ini bekerja dengan cara mematikan bakteri yang menjadi penyebab infeksi.");
        }else if (btnObat16.getText().equals("Pilocarpine")){
            lblDeskripsiObat.setText("Pilocarpine digunakan untuk mengobati kondisi saat tekanan pada bola mata sangat tinggi, atau dikenal sebagai glaukoma. Obat ini juga digunakan " +"\n"+
                    "untuk mengobati sindrom Sjögren. Sindrom ini adalah penyakit yang disebabkan oleh peradangan kelenjar air mata, air liur, dan " +"\n"+
                    "zat lainnya. Arthritis, paru-paru, ginjal, pembuluh darah, saraf, dan otot mungkin juga terkena.");
        }else if (btnObat16.getText().equals("Streptokinase")){
            lblDeskripsiObat.setText("Streptokinase adalah obat yang digunakan untuk melarutkan gumpalan darah di dalam pembuluh darah. Obat yang juga merupakan enzim ini umumnya " +"\n"+
                    "digunakan langsung setelah pasien mengalami gejala serangan jantung, untuk meningkatkan keselamatannya. Streptokinase juga bisa " +"\n"+
                    "digunakan untuk mengobati penggumpalan darah di paru-paru (pulmonari embolisme) dan di kaki (trombosis vena dalam).");
        }else if (btnObat16.getText().equals("Thiamphenicole")){
            lblDeskripsiObat.setText("Thiamphenicol adalah obat yang digunakan untuk mengobati berbagai infeksi karena bakteri. Selain itu, obat ini juga dapat mengatasi gonore. " +"\n"+
                    "Thiamphenicol merupakan antibiotik golongan kloramfenikol. Obat ini bekerja dengan cara melawan infeksi bakteri.");
        }else if (btnObat16.getText().equals("Vitamin B9 (Asam Volat)")){
            lblDeskripsiObat.setText("Vitamin B9 dikonsumsi untuk mengatasi kondisi kekurangan asam folat dan beberapa jenis anemia. Vitamin ini juga digunakan pada penderita penyakit " +"\n"+
                    "ginjal. Asam folat bekerja dengan membantu tubuh memproduksi dan menjaga pembentukan sel baru, serta membantu mencegah perubahan " +"\n"+
                    "DNA yang dapat menyebabkan kanker.");
        }
    }
    @FXML
    void btnonactionObat17(ActionEvent event) {
        if (btnObat17.getText().equals("Amineptine")){
            lblDeskripsiObat.setText("Amineptine adalah obat yang digunakan untuk mengatasi depresi atau gangguan psikologis. Amineptine bekerja dengan cara mencegah kelebihan hormon " +"\n"+
                    "dopamin. Selain itu, obat ini juga memicu pelepasan hormon tersebut. ");
        }else if (btnObat17.getText().equals("Bupropion")){
            lblDeskripsiObat.setText("Bupropion dikonsumsi untuk mengobati gangguan depresi berat dan gangguan mood musiman. Obat ini juga bisa digunakan untuk membantu orang yang " +"\n"+
                    "ingin berhenti merokok, dengan cara mengurangi kecanduan serta ketergantungan terhadap kebiasaan buruk ini. Bupropion bekerja " +"\n"+
                    "dengan cara menyeimbangkan senyawa-senyawa tertentu di otak, contohnya dopamin dan noreprinephrine.");
        }else if (btnObat17.getText().equals("Ceftazidime")){
            lblDeskripsiObat.setText("Ceftazidime adalah antibiotik yang digunakan untuk mengobati berbagai infeksi bakteri, termasuk infeksi yang mengancam jiwa.");
        }else if (btnObat17.getText().equals("Disulfiram")){
            lblDeskripsiObat.setText("Disulfiram digunakan untuk mengatasi kecanduan alkohol kronis karena efek samping yang ditimbulkan akan terasa tidak nyaman saat disulfiram " +"\n"+
                    "digunakan bersamaan dengan alkohol. Disulfiram menghambat enzim yang berpengaruh dalam memetabolisme alkohol dalam tubuh. " +"\n"+
                    "Disulfiram akan menghasilkan efek samping yang sangat tidak enak jika dikombinasikan dengan alkohol.");
        }else if (btnObat17.getText().equals("Furosemide")){
            lblDeskripsiObat.setText("Furosemide digunakan untuk mengatasi retensi cairan (bengkak) pada pasien yang menderita gagal jantung kongestif, gangguan lever, atau gangguan " +"\n"+
                    "ginjal seperti sindrom nefrotik (ginjal bocor). Furosemide juga dapat digunakan untuk mengobati hipertensi. Furosemide merupakan " +"\n"+
                    "obat loop diuretik yang mencegah tubuh terlalu banyak mengabsorpsi garam. Obat ini membuat garam mudah dibuang oleh tubuh melalui urine.");
        }else if (btnObat17.getText().equals("Lorazepam")){
            lblDeskripsiObat.setText("B iasanya pengidap gangguan kecemasan akan disarankan untuk mengonsumsi obat lorazepam yang memang dapat mengobati gangguan kecemasan. " +"\n"+
                    "Lorazepam merupakan obat golongan benzodiazepin. Lorazepam bekerja dengan cara memengaruhi produksi bahan kimia di otak yang tidak " +"\n"+
                    "seimbang pada orang yang memiliki gangguan kecemasan sehingga memberikan efek menenangkan. ");
        }else if (btnObat17.getText().equals("Metoclopramide")){
            lblDeskripsiObat.setText("Metoclopramide digunakan untuk mengobati kembalinya isi lambung ke kerongkongan (refluks gastrofageal) dan untuk mengobati pengosongan lambung " +"\n"+
                    "yang tertunda akibat pergerakan otot lambung yang lemah (gastroparesis). Selain itu, metoclopramide digunakan untuk mengobati beberapa " +"\n"+
                    "masalah di perut dan usus, seperti rasa panas di perut, asam lambung, dan maag yang tak kunjung sembuh. Metoclopramide biasanya " +"\n"+
                    "digunakan untuk maag yang muncul setelah makan atau pada siang hari. Obat ini juga dapat digunakan untuk mencegah mual akibat " +"\n"+
                    "kemoterapi atau radiasi pada pasien kanker. Metoclopramide bekerja dengan meningkatkan kontraksi otot saluran pencernaan bagian " +"\n"+
                    "atas. Dengan begitu, metoclopramide akan mempercepat laju pengosongan perut menuju usus. Sedangkan untuk mengurangi rasa mual, " +"\n"+
                    "obat yang satu ini bekerja dengan cara mendorong makanan lebih cepat dari lambung ke usus.");
        }else if (btnObat17.getText().equals("Nilotinib")){
            lblDeskripsiObat.setText("Nilotinib digunakan untuk mengobati kanker darah atau leukemia jenis CML atau Philadelphia chromosome positive chronic myeloid leukemia (CML). " +"\n"+
                    "Nilotinib adalah obat untuk kanker yang bekerja dengan mengganggu pertumbuhan dan penyebaran sel kanker di dalam tubuh.");
        }else if (btnObat17.getText().equals("Pioglitazone")){
            lblDeskripsiObat.setText("Pioglitazone merupakan obat yang digunakan untuk mengendalikan gula darah pada penderita diabetes tipe 2, dan tidak digunakan untuk diabetes " +"\n"+
                    "tipe 1. Pioglitazone merupakan obat diabetes oral. Obat ini bekerja untuk mengendalikan atau mengontrol kadar gula dalam darah.");
        }else if (btnObat17.getText().equals("Streptomycin")){
            lblDeskripsiObat.setText("Streptomycin adalah antibiotik dalam bentuk suntikan yang digunakan untuk mengobati infeksi bakteri sedang atau parah di berbagai bagian tubuh." +"\n"+
                    "Obat ini termasuk ke dalam kelas obat antibiotik aminoglikosid. Cara kerja obat ini adalah membunuh bakteri atau mencegah " +"\n"+
                    "pertumbuhannya. Namun, Streptomycin tidak bisa mengobati infeksi virus seperti demam atau flu.");
        }else if (btnObat17.getText().equals("Tiabendazole")){
            lblDeskripsiObat.setText("Tiabendazole adalah obat yang digunakan untuk mengatasi infeksi akibat cacing parasit. Beberapa contoh penyakit yang disebabkan oleh cacing " +"\n"+
                    "parasit antara lain, strongyloidiasis, dracunculiasis, ascariasis, trichostrongyliasis, trichuriasis, trichinosis, dan " +"\n"+
                    "toxocariasis. Tiabendzole termasuk ke dalam obat golongan antihelmintik. Obat ini bekerja dengan cara menghambat pertumbuhan " +"\n"+
                    "telur dan larva cacing dalam tubuh.");
        }else if (btnObat17.getText().equals("Vitamin C")){
            lblDeskripsiObat.setText("Vitamin C atau asam askorbat digunakan untuk mengatasi dan mencegah kekurangan (defisiensi) vitamin C. Selain itu, sering digunakan untuk " +"\n"+
                    "mengobati seriawan, pilek, infeksi kulit, dan lainnya. Vitamin ini bekerja dengan membantu tubuh menyerap zat besi yang " +"\n"+
                    "dibutuhkan untuk memproduksi sel darah merah");
        }

    }

    @FXML
    void btnonactionObat18(ActionEvent event) {
        if (btnObat18.getText().equals("Aminofilin")){
            lblDeskripsiObat.setText("terhadap bahan-bahan penyebab alergi (alergen) yang menyebabkan keluhan sesak dan batuk.");
        }else if (btnObat18.getText().equals("Busulfan")){
            lblDeskripsiObat.setText("Busulfan adalah obat yang digunakan untuk terapi leukemia myeloid akut (kanker darah dan sumsum tulang). Obat ini juga bisa dikombinasikan " +"\n"+
                    "dengan obat Siklofosfamid untuk mempersiapkan tubuh sebelum menerima transplantasi sel punca dari donor sumsum " +"\n"+
                    "tulang belakang.");
        }else if (btnObat18.getText().equals("Ceftriaxone")){
            lblDeskripsiObat.setText("Ceftriaxone adalah antibiotik yang digunakan untuk mengobati berbagai infeksi akibat bakteri, termasuk infeksi yang mengancam nyawa seperti " +"\n"+
                    "meningitis (peradangan selaput otak). ");
        }else if (btnObat18.getText().equals("Dobutamine")){
            lblDeskripsiObat.setText("Dobutamine digunakan untuk pengobatan jangka pendek gagal jantung, yang diakibatkan oleh melemahnya otot jantung. Dobutamine menstimulasi " +"\n"+
                    "otot jantung dan meningkatkan aliran darah dengan cara membantu jantung untuk bekerja dengan lebih baik.");
        }else if (btnObat18.getText().equals("Losartan")){
            lblDeskripsiObat.setText("Losartan merupakan obat antihipertensi golongan angiotensin II reseptor antagonis. Obat ini mencegah terjadinya penyempitan pembuluh darah, " +"\n"+
                    "menurunkan tekanan darah, dan meningkatkan aliran darah.");
        }else if (btnObat18.getText().equals("Metoprolol")){
            lblDeskripsiObat.setText("Metoprolol digunakan untuk mengobati angina, yaitu nyeri dada akibat kurangnya darah dan oksigen yang menuju jantung, serta hipertensi " +"\n"+
                    "(tekanan darah tinggi). Obat yang satu ini juga digunakan untuk mencegah atau mengobati serangan jantung.");
        }else if (btnObat18.getText().equals("Nimorazole")){
            lblDeskripsiObat.setText("Nimorazole digunakan untuk mengobati berbagai infeksi akibat bakteri maupun protozoa seperti trichomoniasis. Trichomoniasis adalahsalah satu " +"\n"+
                    "infeksi menular seksual akibat infeksi protozoa parasit Trichomonas vaginalis. Selain itu, nimorazole juga digunakan " +"\n"+
                    "untuk mengobati giardiasis yaitu infeksi umum pada usus yang disebabkan oleh Giardia lamblia dan ulcerative " +"\n"+
                    "gingivitis (peradangan gusi).");
        }else if (btnObat18.getText().equals("Piracetam")){
            lblDeskripsiObat.setText("Piracetam merupakan obat yang digunakan untuk meningkatkan kinerja kognitif saat terjadi gangguan serebrokortikal. Obat ini juga digunakan " +"\n"+
                    "untuk mengobati mioklonus kortikal (gerakan otot yang tidak disadari).");
        }else if (btnObat18.getText().equals("Strontinum")){
            lblDeskripsiObat.setText("Strontium ranelate dapat meningkatkan formasi tulang dan mencegah kehilangan massa otot jika digunakan pada wanita pasca menopasue yang " +"\n"+
                    "menderita osteoporosis. Strontium klorida hexahidrat biasanya dijadikan bahan campuran pada pasta gigi untuk " +"\n"+
                    "meredakan nyeri akibat gigi sensitif. Strontium klorida juga merupakan bentuk strontium yang paling umum " +"\n"+
                    "ditemukan di suplemen diet.");
        }else if (btnObat18.getText().equals("Ticlopidine")){
            lblDeskripsiObat.setText("Ticlopidine merupakan obat yang digunakan untuk mencegah stroke, ketika konsumsi aspirin tidak berhasil. Obat ini juga digunakan untuk " +"\n"+
                    "mencegah penggumpalan darah setelah mengalami serangan jantung atau stroke.");
        }else if (btnObat18.getText().equals("Vitamin D")){
            lblDeskripsiObat.setText("Vitamin D dibutuhkan untuk regulasi mineral kalsium dan fosfat yang ditemukan dalam tubuh. Vitamin ini juga memegang peranan penting " +"\n"+
                    "dalam mempertahankan kepadatan tulang.");
        }

    }

    @FXML
    void btnonactionObat19(ActionEvent event) {
        if (btnObat19.getText().equals("Amiodarone")){
            lblDeskripsiObat.setText("Amiodarone adalah obat untuk mengobati supraventikular, yaitu kondisi di mana terjadi peningkatan kecepatan denyut jantung. Selain " +"\n"+
                    "itu, obat ini juga digunakan untuk mengobati gangguan irama jantung yang penyebabnya berasal dari bilik bawah " +"\n"+
                    "jantung (ventrikel) yang biasa disebut ventrikular aritmia. Obat ini juga digunakan untuk orang-orang yang " +"\n"+
                    "mengalami henti jantung atau disebut pulseless ventrikular takikardi. Cara kerja obat ini ialah dengan " +"\n"+
                    "menstabilkan irama jantung yang terganggu akibat gangguan sinyal-sinyal listrik pada jantung.");
        }else if (btnObat19.getText().equals("Cefuroxime")){
            lblDeskripsiObat.setText("Cefuroxime adalah antibiotik yang digunakan untuk mengobati berbagai jenis infeksi akibat bakteri termasuk infeksi yang mengancam jiwa.");
        }else if (btnObat19.getText().equals("Docosahexaenoic Acid (DHA)")){
            lblDeskripsiObat.setText("DHA merupakan suplemen yang digunakan oleh bayi prematur untuk membantu perkembangan mentalnya menjadi lebih baik. DHA memegang peranan " +"\n"+
                    "dalam perkembangan jaringan mata dan saraf. DHA juga dapat mengurangi kemungkinan penyakit jantung dan pembuluh" +"\n"+
                    "darah, dengan cara mengurangi kekentalan darah dan mengurangi kadar trigliserida dalam darah.");
        }else if (btnObat19.getText().equals("Lovastatin")){
            lblDeskripsiObat.setText("Lovastatin adalah obat penurun kolesterol. Kadar kolesterol yang tinggi, terutama kolesterol jahat LDL akan meningkatkan risiko stroke, " +"\n"+
                    "serangan jantung, dan komplikasi jantung lainnya. Orang yang memiliki risiko hiperkolesterolemia adalah pasien " +"\n"+
                    "diabetes atau pasien dengan penyakit jantung koroner, kegemukan, atau memiliki riwayat hiperkolesterolemia di keluarga. " +"\n"+
                    "Lovastatin bekerja dengan cara menurunkan kadar kolestrol jahat (low-density lipoprotein) atau LDL dan kadar trigliserida " +"\n"+
                    "dalam darah, selain itu obat ini juga meningkatkan kadar kolestrol baik (high-density lipoprotein) dalam darah.");
        }else if (btnObat19.getText().equals("Metronidazole")){
            lblDeskripsiObat.setText("Metronidazole tergolong dalam salah satu antibiotik. Obat ini digunakan untuk mengobati infeksi bakteri pada vagina, lambung, hati, kulit, " +"\n"+
                    "persendian, otak, dan saluran pernapasan. Antibiotik yang satu ini juga bisa digunakan sebagai kombinasi dengan obat antiulcer " +"\n"+
                    "untuk mengobati jenis penyakit lambung tertentu. Metronidazole merupakan obat golongan antibiotik yang melawan bakteri. " +"\n"+
                    "Cara kerja obat metronidazole ini ialah dengan menghentikan pertumbuhan bakteri dan protozoa.");
        }else if (btnObat19.getText().equals("Nimustine")){
            lblDeskripsiObat.setText("Nimustine digunakan untuk mengobati malignant glioma, sejenis tumor otak ganas. Nimustine merupakan agen antineoplastik atau obat yang " +"\n"+
                    "digunakan untuk mencegah, membunuh, atau menghambat pertumbuhan dan penyebaran sel kanker.");
        }else if (btnObat19.getText().equals("Piroxicam")){
            lblDeskripsiObat.setText("Piroxicam merupakan obat yang digunakan untuk mengobati nyeri atau pembengkakan pada penyakit rheumatoid arthritis (peradangan sendi). " +"\n"+
                    "iroxicam merupakan obat golongan NSAID atau Non Steroid Anti-Infalamation Drugs. Obat ini bekerja dengan menurunkan pelepasan " +"\n"+
                    "hormon sebagai penyebab timbulnya pembengkakan, peradangan, atau inflamasi, serta rasa sakit pada tubuh. ");
        }else if (btnObat19.getText().equals("Sukralfat")){
            lblDeskripsiObat.setText("Sukralfat adalah obat yang digunakan untuk mengobati dan mencegah ulkus duodenum (luka terbuka yang terjadi pada lapisan dalam lambung dan " +"\n"+
                    "bagian atas usus halus) dan kondisi lain yang ditentukan oleh dokter. Namun, obat ini tidak bisa mencegah kekambuhan lukanya. " +"\n"+
                    "Untuk cara kerjanya sendiri, sukralfat membentuk lapisan pada lukanya. Tujuannya untuk melindungi lukanya dari asam perut, enzim, " +"\n"+
                    "dan garam empedu, sehingga bisa sembuh dengan cepat. Obat ini mengandung garam aluminum dan hanya boleh dibeli di bawah resep dokter");
        }else if (btnObat19.getText().equals("Timolon")){
            lblDeskripsiObat.setText("Timolol adalah obat yang digunakan untuk mengobati hipertensi (tekanan darah tinggi). Obat ini juga digunakan untuk menurunkan risiko kematian " +"\n"+
                    "setelah serangan jantung. Selain itu, timolol juga dapat digunakan untuk mencegah sakit kepala sebelah (migrain). Timolol termasuk obat " +"\n"+
                    "golongan beta bloker. Obat ini bekerja pada jantung dan sirkulasi aliran darah pada arteri serta vena");
        }else if (btnObat19.getText().equals("Vitamin E")){
            lblDeskripsiObat.setText("Vitamin E merupakan vitamin yang larut dalam lemak dan berperan sebagai antioksidan. Vitamin ini digunakan untuk mengatasi dan mencegah " +"\n"+
                    "kekurangan (defisiensi) vitamin E, serta membantu memperlambat proses kerusakan sel. Vitamin E merupakan vitamin penting yang dibutuhkan " +"\n"+
                    "tubuh untuk memperbaiki fungsi banyak organ. Vitamin ini juga merupakan antioksidan yang membantu memperlambat proses kerusakan sel tubuh.");
        }

    }
    @FXML
    void btnonactionObat20(ActionEvent event) {
        if (btnObat20.getText().equals("Amitriptyline")){
            lblDeskripsiObat.setText("Amitriptyline adalah golongan obat antidepresan trisiklik yang bekerja dengan menyeimbangkan senyawa kimia pada otak. Depersi disebabkan " +"\n"+
                    "karena gangguan atau ketidakseimbangan produksi senyawa kimia otak misalnya kekurangan serotonin dan dopamin.");
        }else if (btnObat20.getText().equals("Celecoxib")){
            lblDeskripsiObat.setText("Celecoxib adalah obat yang digunakan untuk mengobati nyeri atau peradangan yang disebabkan oleh sejumlah kondisi, seperti arthritis " +"\n"+
                    "(radang sendi), spondilitis ankilosa (peradangan tulang belakang kronis), dan nyeri saat menstruasi.");
        }else if (btnObat20.getText().equals("Domperidone")){
            lblDeskripsiObat.setText("Domperidone digunakan untuk mengatasi mual dan muntah, serta gangguan pergerakan usus. Domperidone bekerja dengan cara meningkatkan " +"\n"+
                    "pergerakan lambung dan usus.");
        }else if (btnObat20.getText().equals("Lutein")){
            lblDeskripsiObat.setText("Lutein digunakan sebagai vitamin mata untuk mencegah penyakit mata termasuk degenerasi makula (penyakit mata yang menyebabkan kehilangan " +"\n"+
                    "penglihatan), katarak, dan retinitis pigmentosa (penurunan fungsi retina yang mempengaruhi penglihatan pada malam hari dan " +"\n"+
                    "penglihatan tepi dan pada akhirnya bisa menyebabkan kebutaan).");
        }else if (btnObat20.getText().equals("Miconazole")){
            lblDeskripsiObat.setText("Miconazole merupakan obat golongan antifungi yang merusak membran dinding sel jamur dan meningkatkan permeabilitas jamur, disertai " +"\n"+
                    "kehilangan nutrisi. Sebagai antijamur, miconazole bekerja dengan merusak struktur sel jamur, sehingga dapat menghentikan " +"\n"+
                    "pertumbuhan jamur.");
        }else if (btnObat20.getText().equals("Nisoldipine")){
            lblDeskripsiObat.setText("Nisoldipine merupakan salah satu antihipertensi dari golongan obat calcium channel blocker (CCB) yang bekerja dengan merelaksasi dan " +"\n"+
                    "melebarkan diameter pembuluh darah. Dengan begitu, aliran darah meningkat dan tekanan darah bisa diturunkan.");
        }else if (btnObat20.getText().equals("Policresulen")){
            lblDeskripsiObat.setText("Policresulen merupakan obat yang digunakan untuk terapi servisitis (radang pada serviks atau leher rahim), dan vaginitis " +"\n"+
                    "(peradangan pada vagina). Obat ini juga digunakan untuk menghentikan pendarahan (hemostasis) setelah biopsi dan " +"\n"+
                    "pengangkatan polip serviks.");
        }else if (btnObat20.getText().equals("Sulfadizine")){
            lblDeskripsiObat.setText("Sulfadiazine adalah antibiotik yang digunakan untuk mengobati berbagai jenis infeksi yang disebabkan bakteri. Beberapa infeksi yang " +"\n"+
                    "bisa diobati menggunakan obat ini adalah saluran kemih, infeksi telinga, meningitis, malaria, toxolasmosis dan lainnya.");
        }else if (btnObat20.getText().equals("Tizanidine")){
            lblDeskripsiObat.setText("Tizanidine adalah obat yang digunakan untuk mengatasi kekejangan otot ataupun otot kaku akibat sejumlah penyakit, seperti multiple " +"\n"+
                    "sclerosis atau cedera tulang belakang. Tizanidine berfungsi melemaskan otot. Obat ini bekerja dengan cara menghambat " +"\n"+
                    "sinyal saraf yang menghantarkan rasa sakit ke otak, sehingga otot terasa lebih rileks.");
        }else if (btnObat20.getText().equals("Vitamin K")){
            lblDeskripsiObat.setText("Vitamin K bisa digunakan untuk beragam pengobatan. Vitamin ini memiliki dua bentuk, yaitu K1 (phytonadine) dan vitamin K2 (menaquinone). " +"\n"+
                    "Namun, vitamin K1 lebih umum digunakan karena lebih aman, dapat bekerja dengan cepat, kuat, dan lebih baik pada beberapa " +"\n"+
                    "kondisi. Vitamin K berguna untuk proses pembekuan darah, mencegah kekurangan (defisiensi) vitamin K, dan mengobati " +"\n"+
                    "osteoporosis (melemahnya tulang).");
        }

    }

    @FXML
    void btnonactionObat21(ActionEvent event) {
        if (btnObat21.getText().equals("Amlodipine")){
            lblDeskripsiObat.setText("Amlodipine termasuk obat golongan Calcium Channel Blocker (antagonis kalsium). Cara kerja obat golongan ini adalah dengan melemaskan dan " +"\n"+
                    "melebarkan otot polos pembuluh darah yang terdapat pada jantung sehingga aliran darah menuju jantung menjadi lebih lancar.");
        }else if (btnObat21.getText().equals("Cephalexin")){
            lblDeskripsiObat.setText("Cefalexin adalah obat yang digunakan untuk mengobati berbagai infeksi yang disebabkan oleh bakteri. ");
        }else if (btnObat21.getText().equals("Donepezil")){
            lblDeskripsiObat.setText("Donepezil membantu meningkatkan fungsi sel saraf pada otak. Cara kerjanya mencegah pemecahan senyawa kimia yang disebut asetilkolin. Pada " +"\n"+
                    "penderita demensia, kadar senyawa kimia tersebut cukup rendah. Padahal, asetilkolin berguna untuk membantu proses " +"\n"+
                    "mengingat, berpikir, dan menganalisis.");
        }else if (btnObat21.getText().equals("Lysine")){
            lblDeskripsiObat.setText("Donepezil membantu meningkatkan fungsi sel saraf pada otak. Cara kerjanya mencegah pemecahan senyawa kimia yang disebut asetilkolin. Pada " +"\n"+
                    "penderita demensia, kadar senyawa kimia tersebut cukup rendah. Padahal, asetilkolin berguna untuk membantu proses " +"\n"+
                    "mengingat, berpikir, dan menganalisis.");
        }else if (btnObat21.getText().equals("Midazolam")){
            lblDeskripsiObat.setText("Midazolam umumnya diberikan kepada pasien yang akan menjalani operasi kecil, perawatan gigi, atau prosedur medis lainnya. Ini merupakan salah " +"\n"+
                    "satu obat golongan benzodiazepine, yang diberikan untuk membuat tubuh dan pikiran menjadi rileks, serta menimbulkan " +"\n"+
                    "rasa kantuk hingga tidak sadarkan diri.");
        }else if (btnObat21.getText().equals("Nitrazepam")){
            lblDeskripsiObat.setText("Nitrazepam termasuk jenis obat sedatif golongan benzodiazepine yang bekerja dengan cara mencegah aktivitas otak yang berlebihan. Efek ini " +"\n"+
                    "akan memicu rasa kantuk sehingga masalah sulit tidur bisa diatasi.");
        }else if (btnObat21.getText().equals("Potassium Acetate")){
            lblDeskripsiObat.setText("Potassium acetate berperan sebagai elektrolit pengganti ion kalium dalam tubuh.");
        }else if (btnObat21.getText().equals("Sulfamethoxazole")){
            lblDeskripsiObat.setText("Sulfamethoxazole dan kombinasi trimethoprim bekerja dengan cara melawan bakteri yang menyebabkan sejumlah infeksi. Antibiotik termasuk " +"\n"+
                    "sulfamethoxazole tidak bisa mengobati infeksi virus, seperti demam atau flu.");
        }else if (btnObat21.getText().equals("Tobramycin")){
            lblDeskripsiObat.setText("Tobramycin adalah obat yang digunakan untuk mengatasi infeksi bakteri pada kulit, jantung, perut, otak, sumsum tulang belakang, paru-paru, " +"\n"+
                    "dan saluran kemih. Obat ini juga bisa digunakan untuk mengatasi fibrosis kistik.");
        }

    }

    @FXML
    void btnonactionObat22(ActionEvent event) {
        if (btnObat22.getText().equals("Amonium Klorida")){
            lblDeskripsiObat.setText("Obat ini digunakan untuk mengobati batuk dan gangguan pernafasan, mencairkan lendir pada saluran pernafasan, mengurangi reflek batuk dan " +"\n"+
                    "menghilangkan rasa gatal pada tenggorokan (ISO vol. 50) Selain itu, amonium klorida dapat digunakan sebagain agen pengasam " +"\n"+
                    "pada kondisi dimana darah pasien terlalu basa pH nya.");
        }else if (btnObat22.getText().equals("Cetirizine")){
            lblDeskripsiObat.setText("Cetirizine adalah obat yang digunakan untuk mengatasi gatal-gatal dan pembengkakan yang disebabkan oleh hives, yakni alergi pada kulit " +"\n"+
                    "berupa kemerahan dan gatal-gatal.");
        }else if (btnObat22.getText().equals("Dopamine")){
            lblDeskripsiObat.setText("Dopamine digunakan untuk mengobati kondisi tertentu yang terjadi ketika pasien syok, yang disebabkan oleh serangan jantung, trauma, operasi, " +"\n"+
                    "gagal jantung, gagal ginjal, dan kondisi medis serius lainnya.");
        }else if (btnObat22.getText().equals("Minoxidil")){
            lblDeskripsiObat.setText("Minoxidil digunakan untuk mengobati hipertensi yang menyebabkan kerusakan organ vital. Selain itu, obat ini juga dapat digunakan untuk " +"\n"+
                    "mengatasi rambut rontok.");
        }else if (btnObat22.getText().equals("Nitrofurantoin")){
            lblDeskripsiObat.setText("Nitrofurantoin merupakan salah satu obat yang tergolong ke dalam antibiotik. Obat ini digunakan untuk mengobati infeksi pada saluran kemih.");
        }else if (btnObat22.getText().equals("Povidone Iodine")){
            lblDeskripsiObat.setText("Povidone iodine merupakan obat yang digunakan untuk mengobati infeksi pada mulut, tenggorokan, dan vagina. Obat ini juga digunakan sebagai obat kumur.");
        }else if (btnObat22.getText().equals("Sulfanilamide")){
            lblDeskripsiObat.setText("Sulfanilamide adalah obat yang digunakan untuk mengatasi infeksi jamur pada vagina. Jamur yang sering menginfeksi adalah jamur candida, yang " +"\n"+
                    "ditandai dengan gejala rasa perih, gatal, dan keputiuhan pada vagina.");
        }else if (btnObat22.getText().equals("Tramadol")){
            lblDeskripsiObat.setText("Tramadol adalah obat yang umumnya digunakan untuk mengatasi nyeri tingkat sedang hingga berat. Tramadol termasuk obat golongan narkotik dan " +"\n"+
                    "digunakan untuk meredakan rasa nyeri atau sakit. ");
        }

    }

    @FXML
    void btnonactionObat23(ActionEvent event) {
        if (btnObat23.getText().equals("Amoxapine")){
            lblDeskripsiObat.setText("Amoxapine merupakan obat yang digunakan untuk mengobati gejala depresi, kecemasan, atau agitasi (resah dan gelisah). ");
        }else if (btnObat23.getText().equals("Chlordiazepoxide")){
            lblDeskripsiObat.setText("Chlordiazepoxide digunakan untuk mengobati gangguan kecemasan. ");
        }else if (btnObat23.getText().equals("Doripenem")){
            lblDeskripsiObat.setText("Doripenem adalah obat yang digunakan untuk mengatasi infeksi serius pada bagian perut, kandung kemih, atau ginjal.");
        }else if (btnObat23.getText().equals("Misoprostol")){
            lblDeskripsiObat.setText("Misoprostol digunakan untuk mencegah tukak lambung dan usus selama pengobatan menggunakan aspirin atau NSAID lainnya.");
        }else if (btnObat23.getText().equals("Nitrogliserin")){
            lblDeskripsiObat.setText("Nitrogliserin atau dikenal dengan glyceryl trinitrate digunakan untuk mengobati angina, nyeri dada akibat kurangnya asupan oksigen dan darah " +"\n"+
                    "menuju jantung, atau untuk mengobati gagal jantung. ");
        }else if (btnObat23.getText().equals("Pramipexole")){
            lblDeskripsiObat.setText("Pramipexole adalah obat yang digunakan untuk mengobati gejala penyakit Parkinson, seperti kekakuan otot, gemetaran, keram otot, dan pengedalian " +"\n"+
                    "otot yang buruk.");
        }else if (btnObat23.getText().equals("Sulfasalazine")){
            lblDeskripsiObat.setText("Sulfasalazine adalah obat yang digunakan untuk mengatasi penyakit ulseratif kolitis (radang usus besar) dan rheumatoid arthritis (radang sendi) " +"\n"+
                    "pada anak dan orang dewasa.");
        }else if (btnObat23.getText().equals("Tretinoin")){
            lblDeskripsiObat.setText("Tretinoin adalah obat yang digunakan untuk mengatasi jerawat, melembutkan kulit yang kasar, dan mengurangi bercak cokelat pada kulit. Obat " +"\n"+
                    "ini menurunkan jumlah dan keparahan jerawat, serta mempercepat proses pemulihan kulitnya.");
        }

    }

    @FXML
    void btnonactionObat24(ActionEvent event) {
        if (btnObat24.getText().equals("Amoxicillin")){
            lblDeskripsiObat.setText("Amoxicillin adalah antibiotik yang digunakan untuk mengobati infeksi bakteri yang masih peka terhadap amoxicillin.");
        }else if (btnObat24.getText().equals("Chlorpheniramine")){
            lblDeskripsiObat.setText("Chlorpheniramine adalah obat yang digunakan untuk mengatasi hidung berair, bersin-bersin, gatal-gatal, dan mata berair.");
        }else if (btnObat24.getText().equals("Doxycycline")){
            lblDeskripsiObat.setText("Doxycycline adalah antibiotik yang digunakan untuk mengobati berbagai jenis infeksi yang disebabkan bakteri, mulai dari infeksi jerawat, " +"\n"+
                    "infeksi saluran kemih, infeksi usus, infeksi pada mata, gonorrhea, chlamydia, gangguan gusi, dan lainnya.");
        }else if (btnObat24.getText().equals("Modafinil")){
            lblDeskripsiObat.setText("Modafinil digunakan untuk mengobati kantuk berlebih. ");
        }else if (btnObat24.getText().equals("Nizatidine")){
            lblDeskripsiObat.setText("Nizatidine digunakan untuk mengobati tukak (luka) di lambung dan usus.");
        }else if (btnObat24.getText().equals("Praziquantel")){
            lblDeskripsiObat.setText("Praziquantel merupakan obat yang digunakan untuk mengobati infeksi akibat cacing Schistosoma. Cacing tersebut dapat masuk ke tubuh melalui " +"\n"+
                    "kulit yang berkontak langung dengan air yang terkontaminasi.");
        }else if (btnObat24.getText().equals("Sumatripan")){
            lblDeskripsiObat.setText("Sumatriptan adalah obat yang digunakan untuk mengatasi migrain (sakit kepala sebelah) dan sakit kepala cluster. Obat ini hanya mengatasi " +"\n"+
                    "sakit kepala, namun tidak mencegah terjadinya kekambuhan. Selain itu, sumatripan juga tidak bisa mengatasi sakit kepala tensi.");
        }else if (btnObat24.getText().equals("Triamcinolone")){
            lblDeskripsiObat.setText("Triamcinolone adalah obat yang digunakan untuk mengatasi alergi, kolitis ulseratif (radang usus besar), arthritis (peradangan sendi), lupus, " +"\n"+
                    "psoriasis, dan gangguan pernapasan.");
        }

    }

    @FXML
    void btnonactionObat25(ActionEvent event) {
        if (btnObat25.getText().equals("Amphotericin B")){
            lblDeskripsiObat.setText("Amphotericin B digunakan untuk mengobati infeksi jamur, di antaranya kandidiasis oral atau infeksi jamur candida albicans di rongga mulut, " +"\n"+
                    "infeksi jamur di seluruh tubuh, infeksi jamur aspergillosis, endocarditis (peradangan pada jaringan dalam jantung), meningitis " +"\n"+
                    "parah, dan candiduria (infeksi jamur dalam saluran kemih)");
        }else if (btnObat25.getText().equals("Chlorpromazine")){
            lblDeskripsiObat.setText("Chlorpromazine adalah obat yang digunakan untuk mengatasi gangguan psikis, seperti Schizofrenia, depresi episode manik, dan gangguan perilaku " +"\n"+
                    "berat pada anak usia 1 sampai 12 tahun.");
        }else if (btnObat25.getText().equals("Duloxetine")){
            lblDeskripsiObat.setText("Duloxetine digunakan untuk mengobati gangguan depresi mayor pada orang dewasa. Obat ini juga digunakan untuk mengobati gangguan kecemasan umum " +"\n"+
                    "yang terjadi pada orang dewasa dan anak-anak berusia minimal 7 tahun.");
        }else if (btnObat25.getText().equals("Montelukast")){
            lblDeskripsiObat.setText("Montelukast digunakan untuk mengobati alergi yang sudah terjadi selama bertahun-tahun pada orang dewasa dan anak-anak berusia setidaknya" +"\n"+
                    " 6 bulan. Obat ini juga dapat digunakan untuk mengobati gejala alergi musiman pada orang dewasa dan anak-anak berusia " +"\n"+
                    "minimal 2 tahun.");
        }else if (btnObat25.getText().equals("Nordazepam")){
            lblDeskripsiObat.setText("Nordazepam digunakan untuk mengobati insomnia dan gangguan kecemasan. Jika Kamu yang mengalami kesulitan tidur atau insomnia dan kerap merasa " +"\n"+
                    "kecemasan yang berlebihan, mungkin akan disarankan oleh dokter menggunakan obat ini.");
        }else if (btnObat25.getText().equals("Prednisolone")){
            lblDeskripsiObat.setText("Prednisolone digunakan untuk mengobati berbagai kondisi inflamasi (radang atau bengkak) seperti arthritis (peradangan sendi), lupus, " +"\n"+
                    "psoriasis (peradangan kulit), ulceratif kolitis (radang usus besar), alergi, gangguan pada kelenjar (endocrine) dan kondisi " +"\n"+
                    "yang menyerang kulit, mata, paru-paru, perut, sisem saraf, atau sel darah.");
        }else if (btnObat25.getText().equals("Triclosan")){
            lblDeskripsiObat.setText("Triclosan adalah obat yang digunakan untuk mengatasi jerawat, desinfektan untuk tangan, luka, atau bagian kulit lainnya, dan sebagai " +"\n"+
                    "pembersih mulut. Obat ini biasanya terkandung dalam larutan, sabun, atau krim.");
        }

    }

    @FXML
    void btnonactionObat26(ActionEvent event) {
        if (btnObat26.getText().equals("Ampicillin")){
            lblDeskripsiObat.setText("Ampicillin adalah antibiotik untuk mengobati berbagai infeksi bakteri, mulai dari infeksi di saluran pernapasan, demam tifoid dan " +"\n"+
                    "paratifoid, gonorrhoea, pencegahan infeksi bakteri streptokokus saat melahirkan, meningitis, sepsis (infeksi bakteri " +"\n"+
                    "pada darah).");
        }else if (btnObat26.getText().equals("Cholestyramine")){
            lblDeskripsiObat.setText("Cholestyramine adalah obat yang digunakan untuk menurunkan kadar kolesterol yang tinggi dalam darah, terutama LDL (kolestrol jahat).");
        }else if (btnObat26.getText().equals("Morfin")){
            lblDeskripsiObat.setText("Morfin merupakan obat golongan narkotika atau opium. Obat ini digunakan untuk mengurangi rasa sakit yang berat pada tubuh. Meski begitu, " +"\n"+
                    "morfin dapat menyebabkan ketergantungan.");
        }else if (btnObat26.getText().equals("Norepinephrine")){
            lblDeskripsiObat.setText("Norepinephrine digunakan untuk mengobati tekanan darah rendah (hipotensi) fatal, yang dapat terjadi selama prosedur medis atau operasi " +"\n"+
                    "berlangsung. Norepinephrine juga digunakan dalam CPR (resusitasi jantung dan paru).");
        }else if (btnObat26.getText().equals("Prednisone")){
            lblDeskripsiObat.setText("Prednisone merupakan obat yang digunakan sebagai antiradang atau pengobatan imunosupresan. Obat ini juga digunakan untuk terapi berbagai " +"\n"+
                    "kondisi seperti alergi, ulseratif kolitis (radang usus besar), arthritis (radang sendi), lupus, psoriasis (radang kulit), " +"\n"+
                    "atau gangguan pernapasan.");
        }else if (btnObat26.getText().equals("Trihexyphenidyl")){
            lblDeskripsiObat.setText("Trihexyphenidyl adalah obat yang digunakan untuk mengobati tremor, kram, kekakuan, dan kelemahan otot pada penyakit Parkinson. Obat ini " +"\n"+
                    "juga digunakan untuk mengobati dan mencegah gejala penyakit otot akibat penggunaan klorpromazin, flufenazin, ferfenazin, " +"\n"+
                    "haloperidol, thiothixine, dan lainnya.");
        }

    }

    @FXML
    void btnonactionObat27(ActionEvent event) {
        if (btnObat27.getText().equals("Anidulafungin")){
            lblDeskripsiObat.setText("Anidulafungin adalah obat yang digunakan untuk mengatasi infeksi jamur candida (jamur) dalam darah, perut, atau esofagus. Anidulafungin " +"\n"+
                    "merupakan antifungi atau antijamur. Obat ini bekerja dengan cara menghentikan pertumbuhan jamur dan melawan infeksinya.");
        }else if (btnObat27.getText().equals("Ciclosporin")){
            lblDeskripsiObat.setText("Ciclosporin adalah obat yang digunakan untuk menekan reaksi sistem imun dari tubuh (imunosupresan).");
        }else if (btnObat27.getText().equals("Moxifloxacin")){
            lblDeskripsiObat.setText("Moxifloxacin digunakan untuk mengobati berbagai jenis infeksi bakteri. Sejumlah jenis infeksi bakteri yang dimaksud seperti infeksi" +"\n"+
                    "kulit, sinus, paru-paru, dan perut.");
        }else if (btnObat27.getText().equals("Norethisterone")){
            lblDeskripsiObat.setText("Norethisterone adalah obat yang digunakan untuk mencegah kehamilan. Selain itu, obat ini juga digunakan untuk mengobati perdarahan " +"\n"+
                    "berlebihan saat menstruasi (menorrhagia), jaringan rahim yang berada di luar rahim (endometriosis), sindrom pramenstruasi, " +"\n"+
                    "dan kanker payudara.");
        }else if (btnObat27.getText().equals("Pregabalin")){
            lblDeskripsiObat.setText("Pregabalin merupakan obat yang digunakan untuk mengontrol kejang dan mengobati fibromyalgia (nyeri pada otot dan tulang). Pregabalin juga " +"\n"+
                    "digunakan untuk mengobati rasa sakit yang disebabkan oleh kerusakan saraf pada penderita diabetes (neuropati diabetik), herpes " +"\n"+
                    "zoster (cacar api), atau cedera medulla spinalis.");
        }else if (btnObat27.getText().equals("Trimethoprin")){
            lblDeskripsiObat.setText("Trimethoprim adalah obat yang digunakan untuk mengatasi infeksi ginjal atau organ kemih, serta infeksi telinga karena beberapa bakteri " +"\n"+
                    "tertentu. Trimethoprim termasuk sejenis antibiotik. Obat ini bekerja dengan cara melawan bakteri dalam tubuh.");
        }

    }

    @FXML
    void btnonactionObat28(ActionEvent event) {
        if (btnObat28.getText().equals("Apixaban")){
            lblDeskripsiObat.setText("Apixaban adalah obat yang digunakan untuk menurunkan risiko stroke akibat penggumpalan darah pada penderita gangguan ritme jantung (atrial " +"\n"+
                    "fibrillation). Obat ini juga digunakan setelah operasi penggantian panggul atau lutut untuk mencegah penggumpalan darah (deep vein " +"\n"+
                    "thrombosis/DVT) di dalam paru-paru (pulmonary embolism/PE).");
        }else if (btnObat28.getText().equals("Cilostazol")){
            lblDeskripsiObat.setText("Cilostazol adalah obat yang digunakan untuk mengobati gejala klaudikasio, yaitu rasa nyeri atau kram di tungkai bawah akibat kurangnya" +"\n"+
                    "aliran darah ke otot yang selalu hilang dan timbul. Obat ini dapat memperbaiki kemampuan berjalan jauh tanpa disertai rasa nyeri.");
        }else if(btnObat28.getText().equals("Mupirocin")){
            lblDeskripsiObat.setText("Mupirocin adalah antibiotik, digunakan untuk mengobati atau mencegah infeksi akibat bakteri. Infeksi virus tidak dapat disembuhkan" +"\n"+
                    "dengan antibiotik");
        }else if (btnObat28.getText().equals("Noscapine")){
            lblDeskripsiObat.setText("Noscapine digunakan untuk semua kondisi yang membutuhkan efek antitusif, seperti batuk. Efek tersebut berfungsi untuk menekan batuk.");
        }else if (btnObat28.getText().equals("Probenecid")){
            lblDeskripsiObat.setText("Probenecid merupakan obat yang digunakan untuk mengobati asam urat dan nyeri sendi akibat kadar asam urat yang tinggi dalam " +"\n"+
                    "tubuh. Probenecid bekerja dengan membantu tubuh agar mengeluarkan asam urat keluar melalui urine, yang tentunya akan " +"\n"+
                    "menurunkan kadar asam urat dalam tubuh.");
        }else if (btnObat28.getText().equals("Triprolidine")){
            lblDeskripsiObat.setText("Triprolidine adalah obat yang digunakan untuk mengatasi bersin, hidung berair, mata berair, kulit ruam, gatal, gejala pilek, serta " +"\n"+
                    "gejala alergi lainnya. Triprolidine termasuk golongan obat antihistamin. Obat ini bekerja dengan cara menurunkan jumlah histamin " +"\n"+
                    "dalam tubuh. Pasalnya, histamin dapat menimbulkan gejala alergi.");
        }

    }

    @FXML
    void btnonactionObat29(ActionEvent event) {
        if (btnObat29.getText().equals("Arginine")){
            lblDeskripsiObat.setText("Arginine adalah suplemen yang biasa diberikan untuk berbagai masalah kesehatan. Misalnya mengobati nyeri dada, gangguan ereksi atau impotensi " +"\n"+
                    "pada pria. Arginine merupakan asam amino yang secara alamiah terdapat di dalam tubuh manusia.");
        }else if (btnObat29.getText().equals("Cimetidine")){
            lblDeskripsiObat.setText("Cimetidine adalah obat yang digunakan untuk mengobati dan mencegah beberapa tipe dari tukak atau luka di lambung, dan untuk mengobati " +"\n"+
                    "kondisi yang menyebabkan lambung terlalu banyak memproduksi asam lambung.");
        }else if (btnObat29.getText().equals("Nystatin")){
            lblDeskripsiObat.setText("Nystatin digunakan untuk mengobati infeksi jamur atau fungi. Nystatin digunakan untuk mengatasi infeksi jamur candida pada rongga mulut, " +"\n"+
                    "tenggorokan, usus, dan juga vagina.");
        }else if (btnObat29.getText().equals("Procainamide")){
            lblDeskripsiObat.setText("Procainamide digunakan untuk mengobati aritmia (detak jantung yang tidak normal). Procainamide membantu menjaga jantung agar berdetak secara " +"\n"+
                    "normal pada orang dengan gangguan irama jantung tertentu dari ventrikel.");
        }else if (btnObat29.getText().equals("Tripsin")){
            lblDeskripsiObat.setText("Tripsin adalah enzim yang akan mengubah protein menjadi bentuk lebih kecil, sehingga dapat diserap oleh usus. Obat ini digunakan untuk " +"\n"+
                    "mereka yang kekurangan enzim pencernaan. Tripsin biasanya dikombinasikan dengan bromelain dan digunakan secara rutin untuk " +"\n"+
                    "mengobati osteoarthritis. Obat ini juga dapat membantu mengobati luka pada kulit.");
        }

    }
    @FXML
    void btnonactionObat30(ActionEvent event) {
        if (btnObat30.getText().equals("Aripiprazole")){
            lblDeskripsiObat.setText("Aripiprazole adalah obat untuk pasien dengan gangguan mental atau gangguan perubahan mood seperti dimana mood yang berlebihan dan sering " +"\n"+
                    "(contohnya bipolar disorder, schizophrenia, Tourette's disorder). Obat ini juga dapat dikombinasi dengan obat lain untuk " +"\n"+
                    "terapi depresi.");
        }else if (btnObat30.getText().equals("Cinnarizine")){
            lblDeskripsiObat.setText("Cinnarizine digunakan untuk mengontrol mual muntah saat perjalanan, mengatasi vertigo (pusing seperti berputar), tinnitus (telinga berdenging), " +"\n"+
                    "dan perasaan tidak enak badan.");
        }else if (btnObat30.getText().equals("Prochlorperazine")){
            lblDeskripsiObat.setText("Prochlorperazine merupakan obat yang digunakan untuk mengobati gangguan kejiwaan (psikotik) seperti skizofrenia. Obat ini juga digunakan untuk " +"\n"+
                    "terapi kecemasan serta mengontrol mual dan muntah berat.");
        }

    }

    @FXML
    void btnonactionObat31(ActionEvent event) {
        if (btnObat31.getText().equals("Asam Alginat")){
            lblDeskripsiObat.setText("Asam alginat digunakan untuk mengobati gangguan pencernaan dengan gejala heartburn atau sensasi terbakar pada lambung, bisa juga untuk mengobati " +"\n"+
                    "luka pada lambung, GERD (refluks asam lambung), dan hiatal hernia yaitu kondisi ketika ootot diafargma terdorong oleh perut.");
        }else if (btnObat31.getText().equals("Ciprofloxacin")){
            lblDeskripsiObat.setText("Ciprofloxacin adalah sejenis antibiotik yang digunakan untuk mengobati beberapa infeksi yang disebabkan oleh bakteri.");
        }else if (btnObat31.getText().equals("Progesteron")){
            lblDeskripsiObat.setText("Progesteron merupakan hormon pada wanita yang berperan dalam ovulasi dan menstruasi.");
        }

    }

    @FXML
    void btnonactionObat32(ActionEvent event) {
        if (btnObat32.getText().equals("Asam Amino")){
            lblDeskripsiObat.setText("Asam amino adalah obat atau vitamin yang digunakan untuk mengobati gangguan ginjal yang disertai dengan diet rendah protein dan rendah kalori.");
        }else if (btnObat32.getText().equals("Cisplatin")){
            lblDeskripsiObat.setText("Cisplatin adalah obat kanker atau obat kemoterapi. Obat ini khususnya digunakan untuk mengobati kanker kandung kemih, kanker testikular (testis), " +"\n"+
                    "dan kanker ovarium.");
        }else if (btnObat32.getText().equals("Promethazine")){
            lblDeskripsiObat.setText("Promethazine digunakan untuk mengatasi gejala alergi seperti gatal, hidung berair, bersin, mata berair, dan kulit kemerahan. Obat ini " +"\n"+
                    "juga mencegah mual muntah setelah operasi dan bersifat sedatif atau menyebabkan kantuk. Promethazine bekerja dengan mengubah " +"\n"+
                    "aksi sinyal kimia di otak. Selain itu, obat ini dapat berperan sebagai antihistamin sehingga mengurangi efek dari alergen.");
        }

    }

    @FXML
    void btnonactionObat33(ActionEvent event) {
        if (btnObat33.getText().equals("Asam Borat")){
            lblDeskripsiObat.setText("Asam borat digunakan sebagai antiseptik untuk kelopak mata yang meradang, sebagai pelindung kulit, atau untuk mengobati infeksi pada kulit.");
        }else if (btnObat33.getText().equals("Citalopram")){
            lblDeskripsiObat.setText("Citalopram merupakan obat antidepresan golongan SSRI yang bekerja mengatur jumlah serotonin. ");
        }else if (btnObat33.getText().equals("Propofol")){
            lblDeskripsiObat.setText("Propofol digunakan untuk membantu pasien rileks sebelum dan selama anestesi saat operasi maupun prosedur medis lainnya. Obat ini juga digunakan " +"\n"+
                    "untuk menenangkan seseorang dalam pengobatan kritis dan membutuhkan mesin pernapasan. Propofol bekerja dengan cara menurunkan " +"\n"+
                    "kerja otak dan sistem saraf, sehingga Kamu merasa lebih rileks atau tenang.");
        }
    }
      @FXML
    void btnonactionObat34(ActionEvent event) {
        if (btnObat34.getText().equals("Asam Glikolat")){
            lblDeskripsiObat.setText("Kalau kulit Kamu kering, kering, kasar, terkelupas, gatal, dan iritasi, asam glikolat adalah obatnya. Asam glikolat berfungsi sebagai pelembab, " +"\n"+
                    "yang selain mengobati juga mencegah masalah kulit tadi. Asal glikolat juga bisa untuk mengobati ruam popok, atau kulit terbakar " +"\n"+
                    "akibat terapi radiasi. Asam glikolat disebut juga sebagai emolien (pelembab). Emolien adalah bahan yang melembutkan dan " +"\n"+
                    "melembabkan kulit, dan mengurangi gatal dan kulit bersisik. Emolien bekerja dengan cara membentuk lapisan minyak pada permukaan " +"\n"+
                    "kulit sehingga dapat menahan air di dalam kulit.");
        }else if (btnObat34.getText().equals("Citicolin")){
            lblDeskripsiObat.setText("Citicolin adalah obat yang digunakan untuk mengobati gangguan ingatan atau pikun dan masalah berpikir lainnya yang disebabkan oleh usia. Selain " +"\n"+
                    "itu, obat ini juga dapat membantu penyembuhan pasca stroke, mengobati penyakit Alzheimer, glaukoma dan beberapa gejala penyakit " +"\n"+
                    "Parkinson. Citicoline bekerja dengan cara meningkatkan aliran darah dan meningkatkan oksigen ke dalam otak.");
        }else if (btnObat34.getText().equals("Propranolol")){
            lblDeskripsiObat.setText("Propranolol digunakan untuk menangani tremor, angina (nyeri dada), hipertensi (tekanan darah tinggi), dan gangguan ritme jantung. Obat ini " +"\n"+
                    "juga digunakan untuk mencegah dan mengatasi serangan jantung, serta mengurangi frekuensi migrain. Propranolol merupakan " +"\n"+
                    "golongan beta-bloker. Obat ini bekerja pada jantung dan sirkulasi darah, sehingga pembuluh darah mengalami vasodilatasi.");
        }

    }

    @FXML
    void btnonactionObat35(ActionEvent event) {
        if (btnObat35.getText().equals("Asam Mefenamat")){
            lblDeskripsiObat.setText("Asam mefenamat digunakan untuk menghilangkan rasa nyeri ringan sampai dengan sedang akibat berbagai kondisi, termasuk mengurangi nyeri saat haid.");
        }else if (btnObat35.getText().equals("Claritrhomycin")){
            lblDeskripsiObat.setText("Claritrhomycin adalah antibiotik yang digunakan untuk mengobati berbagai jenis infeksi yang disebabkan oleh bakteri, terutama yang memengaruhi " +"\n"+
                    "kulit dan sistem pernapasan.");
        }else if (btnObat35.getText().equals("Propylthiouracil")){
            lblDeskripsiObat.setText("Propylthiouracil digunakan untuk mengatasi hipertiroid, Graves' disease atau gondok toksik (tiroid yang memperbesar).");
        }

    }

    @FXML
    void btnonactionObat36(ActionEvent event) {
        if (btnObat36.getText().equals("Asam Salisilat")){
            lblDeskripsiObat.setText("Kalau Kamu pernah atau sedang mengalami keluhan jerawat, pasti akrab dengan obat asam salisilat. Yup, asam salisilat memang biasa digunakan " +"\n"+
                    "dalam pengobatan jerawat. Asam salisilat memiliki efek keratolitik atau menghilangkan lapisan keratin di luar kulit. Ini " +"\n"+
                    "berguna untuk meningkatkan kelembapan kulit dengan melembutkan atau meluruhkan lapisan tanduk pada kulit (keratin). Asam " +"\n"+
                    "salisilat juga membantu sel kulit mati menjadi cepat rontok dan membantu kadar air dalam kulit tetap terjaga.");
        }else if (btnObat36.getText().equals("Clindamycin")){
            lblDeskripsiObat.setText("Clindamycin adalah antibiotik yang digunakan untuk mengobati infeksi serius yang disebabkan oleh bakteri. Clindamycin merupakan sejenis onat " +"\n"+
                    "antibiotik. Obat ini bekerja dengan cara melawan bakteri dalam tubuh.");
        }else if (btnObat36.getText().equals("Pseudoephedrine")){
            lblDeskripsiObat.setText("Pseudoephedrine digunakan untuk mengatasi hidung tersumbat, atau mengatasi sumbatan pada saluran eustachius (saluran dalam telinga).");
        }

    }

    @FXML
    void btnonactionObat37(ActionEvent event) {
        if (btnObat37.getText().equals("Asam Traneksamat")){
            lblDeskripsiObat.setText("Asam traneksamat digunakan untuk mengobati kondisi perdarahan yang sedang Kamu alami.");
        }else if (btnObat37.getText().equals("Clobazam")){
            lblDeskripsiObat.setText("Clobazam adalah obat yang digunakan untuk mengatasi gangguan kecemasan.");
        }else if (btnObat37.getText().equals("Pyrazinamide")){
            lblDeskripsiObat.setText("Pyrazinamide digunakan mengobati tuberkulosis pada anak maupun dewasa. Bakteri tuberkulosis dapat resisten (kebal terhadap obat) jika digunakan " +"\n"+
                    "sendirian, sehingga Kamu yang memiliki TB akan mendapat pengobatan kombinasi.");
        }

    }

    @FXML
    void btnonactionObat38(ActionEvent event) {
        if (btnObat38.getText().equals("Asam Ursodeoksikolat")){
            lblDeskripsiObat.setText("Asam ursodeoksikolat berfungsi untuk melarutkan batu empedu kolestrol, mengobati sirosis bilier primer, yakni penyakit autoimun yang " +"\n"+
                    "menyebabkan kerusakan progresif pada saluran empedu, serta sebagai pencegahan pembentukan batu empedu pada pasien yang " +"\n"+
                    "mengalami penurunan berat badan secara drastis.");
        }else if (btnObat38.getText().equals("Clonazepam")){
            lblDeskripsiObat.setText("Clonazepam adalah obat yang digunakan untuk mengobati beberapa gangguan kejang (obat antiepilepsi) pada dewasa dan anak-anak.");
        }else if (btnObat38.getText().equals("Pyridoxine")){
            lblDeskripsiObat.setText("Pyridoxine adalah vitamin B6 yang digunakan untuk mencegah kekurangan vitamin B6.");
        }

    }

    @FXML
    void btnonactionObat39(ActionEvent event) {
        if (btnObat39.getText().equals("Asam Valproat")){
            lblDeskripsiObat.setText("Asam valproat akan menghambat senyawa kimia tertentu pada tubuh, yang dapat memicu kejang.");
        }else if (btnObat39.getText().equals("Clonidine")){
            lblDeskripsiObat.setText("Clonidine digunakan untuk mengobati tekanan darah tinggi.");
        }

    }
    @FXML
    void btnonactionObat40(ActionEvent event) {
        if (btnObat40.getText().equals("Asenapine")){
            lblDeskripsiObat.setText("Asenapine adalah obat yang digunakan untuk mengatasi gangguan bipolar, gangguan stres " + "\n"+
                    "pasca trauma, schizofrenia, gangguan schizoafektif dan lainnya.");
        }else if (btnObat40.getText().equals("Clopidogrel")){
            lblDeskripsiObat.setText("Clopidogrel digunakan untuk mencegah bekuan darah setelah terkena serangan jantung atau stroke.");
        }

    }

    @FXML
    void btnonactionObat41(ActionEvent event) {
        if (btnObat41.getText().equals("Asetilkolin")){
            lblDeskripsiObat.setText("Asetilkolin kerap digunakan oleh dokter spesialis mata pada saat operasi mata, untuk mengecilkan pupil mata.");
        }else if (btnObat41.getText().equals("Clotrimazole")){
            lblDeskripsiObat.setText("Clotrimazole merupakan obat antijamur. Obat ini bekerja dengan cara melawan infeksi yang disebabkan oleh jamur.");
        }

    }

    @FXML
    void btnonactionObat42(ActionEvent event) {
        if (btnObat42.getText().equals("Aspirin")) {
            lblDeskripsiObat.setText("Aspirin umum digunakan untuk meredakan sakit kepala, nyeri otot, sakit gigi, nyeri haid, nyeri dan " + "\n"+
                    "demam akibat pilek, serta nyeri karena radang sendi.");
        }else if (btnObat42.getText().equals("Clozapine")){
            lblDeskripsiObat.setText("Clozapine digunakan untuk mengobati schizophrenia parah. Obat ini juga digunakan untuk" + "\n"+
                    " mencegah risiko bunuh diri pada pasien yang menderita schizophrenia atau penyakit yang serupa lainnya.");
        }

    }

    @FXML
    void btnonactionObat43(ActionEvent event) {
        if (btnObat43.getText().equals("Astaxanthin")){
            lblDeskripsiObat.setText("Astaxanthin digunakan untuk mengatasi penurunan penglihatan yang disebabkan oleh usia, menurunkan" + "\n"+
                    " kolesterol, meringankan gejala menopause, mengatasi kulit berkeriput, dan mempercepat penyembuhan setelah stroke. ");
        }else if(btnObat43.getText().equals("Co-trimoxazole")){
            lblDeskripsiObat.setText("Co-trimoxazole merupakan kombinasi obat antibiotik yang digunakan untuk mengobati infeksi telinga, infeksi saluran kemih, bronkitis " +"\n"+
                    "(peradangan saluran bronkus), diare, shigellosis (infeksi akibat bakteri shigella) dan pneumocystis pneumonia (infeksi" +"\n"+
                    " serius yang menyebabkan peradangan dan penumpukan cairan pada paru-paru). Co-trimoxazole merupakan gabungan antibiotik " +"\n"+
                    "sulfamthoxazole dan trimethoprim yang bekerja dengan cara melawan bakteri dalam tubuh.");
        }

    }

    @FXML
    void btnonactionObat44(ActionEvent event) {
        if (btnObat44.getText().equals("Astemizole")){
            lblDeskripsiObat.setText("Astemizole adalah obat yang digunakan untuk mengatasi gejala rhinitis, terutama gejala alerginya. " + "\n"+
                    "Biasanya, alergi tersebut disebabkan oleh perubahan cuaca.");
        }else if (btnObat44.getText().equals("Codeine")){
            lblDeskripsiObat.setText("Codeine adalah obat yang digunakan untuk mengatasi nyeri sedang sampai parah.");
        }

    }

    @FXML
    void btnonactionObat45(ActionEvent event) {
        if (btnObat45.getText().equals("Atenolol")){
            lblDeskripsiObat.setText("Atenolol digunakan untuk pengobatan hipertensi, yakni menurunkan tekanan darah. Jadi, obat" + "\n"+
                    " ini dapat membantu mencegah stroke, serangan jantung, dan masalah pada ginjal.");
        }else if (btnObat45.getText().equals("Coenzyme Q10")){
            lblDeskripsiObat.setText("Coenzyme Q10, ubiquinone, atau ubidecarenone digunakan untuk mengobati kekurangan coenzyme Q10. Obat ini " + "\n"+
                    "juga mengurangi gejala gangguan mitokondria, kondisi yang memengaruhi produksi energi dalam sel tubuh.");
        }

    }

    @FXML
    void btnonactionObat46(ActionEvent event) {
        if (btnObat46.getText().equals("Atorvastatin")){
            lblDeskripsiObat.setText("Atorvastatin digunakan untuk mengobati kolesterol tinggi, serta menurunkan risiko terkena stroke," + "\n"+
                    " jantung koroner, dan serangan jantung atau komplikasi jantung lain pada pasien dengan diabetes melitus tipe 2.");
        }else if (btnObat46.getText().equals("Colchicine")){
            lblDeskripsiObat.setText("Colchicine digunakan untuk mengobati atau mencegah asam urat. Obat ini juga dapat digunakan untuk " + "\n"+
                    "mengobati gejala penyakit Behcet, gangguan langka yang menyebabkan peradangan pada pembuluh darah.");
        }

    }

    @FXML
    void btnonactionObat47(ActionEvent event) {
        if (btnObat47.getText().equals("Atropin")){
            lblDeskripsiObat.setText("Atropin merupakan obat yang termasuk dalam golongan agen antikolinergik, yang secara kompetitif " + "\n"+
                    "menghambat reseptor muskarinik pada jaringan perifer, seperti jantung, usus, otot bronkus, iris mata, dan kalenjar sekresi.");
        }else if (btnObat47.getText().equals("Colistin")){
            lblDeskripsiObat.setText("Colistin digunakan untuk mengobati infeksi yang disebabkan oleh bakteri gram negatif. Dalam bentuk " + "\n"+
                    "tablet, obat ini dapat mengatasi infeksi pada saluran pencernaan dan strerilisasi usus.");
        }

    }

    @FXML
    void btnonactionObat48(ActionEvent event) {
        if (btnObat48.getText().equals("Attapulgite")){
             lblDeskripsiObat.setText("Salah satu masalah pencernaan yang kerap terjadi adalah diare. Jika Kamu sedang mengalaminya," + "\n"+
                     " ini dapat diobati dengan menggunakan attapulgite.");
        }else if (btnObat48.getText().equals("Cortisone")){
            lblDeskripsiObat.setText("Cortisone adalah obat dari golongan steroid yang dapat digunakan untuk mengatasi berbagai " + "\n"+
                    "masalah kesehatan, mulai dari alergi, gangguan kulit, kolitis ulseratif (radang usus kronis), arthritis " + "\n"+
                    "(radang sendi), lupus, psoriasis, atau gangguan pernapasan.");
        }

    }

    @FXML
    void btnonactionObat49(ActionEvent event) {
        if (btnObat49.getText().equals("Azatadine")){
             lblDeskripsiObat.setText("Azatadine adalah obat yang digunakan untuk mengatasi kondisi alergi seperti kemerahan, gatal-gatal," + "\n"+
                     " dan lainnya.");
        }else if (btnObat49.getText().equals("Cyclophosphamide")){
            lblDeskripsiObat.setText("Cyclophosphamide adalah obat yang digunakan untuk mengobati beberapa jenis kanker. Obat ini juga " + "\n"+
                    "dapat digunakan untuk mengatasi beberapa jenis sindrom nefrotik (ginjal bocor) pada anak.");
        }

    }
    @FXML
    void btnonactionObat50(ActionEvent event) {
        if (btnObat50.getText().equals("Azathioprine")){
             lblDeskripsiObat.setText("Azathioprine bertugas untuk menurunkan sistem imun tubuh. Mengapa demikian? Karena selain membantu" + "\n"+
                     " tubuh melawan infeksi, sistem imun juga akan menolak organ tubuh yang ditransplantasi, seperti ginjal dan hati.");
        }else if (btnObat50.getText().equals("Cyproheptadine")){
            lblDeskripsiObat.setText("Cyproheptadine merupakan golongan obat antihistamin. Obat ini bekerja dengan cara mengurangi efek " + "\n"+
                    "dari histamin alami yang ada dalam tubuh. Histamin dapat menyebabkan munculnya gejala bersin-bersin, gatal-gatal, " + "\n"+
                    "mata berair, dan hidung berair.");
        }

    }

    @FXML
    void btnonactionObat51(ActionEvent event) {
        if (btnObat51.getText().equals("Azithromycin")){
             lblDeskripsiObat.setText("Azithomrycin adalah obat yang digunakan untuk mengobati beberapa infeksi bakteri, seperti infeksi" + "\n"+
                     " pernapasan, infeksi kulit, infeksi telinga, penyakit menular seksual, dan sebagainya.");
        }

    }

    @FXML
    void btnonactionObat52(ActionEvent event){

    }

    @FXML
    void btnonactionObat53(ActionEvent event){

    }

    @FXML
    void btnonactionObat54(ActionEvent event){

    }

    @FXML
    void btnonactionObat55(ActionEvent event){

        }

    }




