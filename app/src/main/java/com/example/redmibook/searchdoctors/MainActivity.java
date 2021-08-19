package com.example.redmibook.searchdoctors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button300, button400, button500, button600, button700, button800, button1000,
            buttonMedicine, buttonGynecology, buttonSurgery, buttonOrthopedics, buttonChild,
            buttonSkin, buttonDental, buttonEnt, buttonEye, buttonCardiology, buttonGastroenterology,
            buttonOncology, buttonNeurology, buttonRheumatology, buttonEndocrinology, buttonUrology, buttonHepatology,
            buttonProfessor, buttonAssociateProfessor, buttonAssistantProfessor, buttonConsultant, buttonMedicalOfficer ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button300 = (Button) findViewById(R.id.threeHundredTakaButtonId);
        button300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThreeHundredTakaActivity.class);
                startActivity(intent);
            }
        });

        button400 = (Button) findViewById(R.id.fourHundredTakaButtonId);
        button400.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FourHundredTakaActivity.class);
                startActivity(intent);
            }
        });

        button500 = (Button) findViewById(R.id.fiveHundredTakaButtonId);
        button500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FiveHundredTakaActivity.class);
                startActivity(intent);
            }
        });

        button600 = (Button) findViewById(R.id.sixHundredTakaButtonId);
        button600.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SixHundredTakaActivity.class);
                startActivity(intent);
            }
        });

        button700 = (Button) findViewById(R.id.sevenHundredTakaButtonId);
        button700.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SevenHundredTakaActivity.class);
                startActivity(intent);
            }
        });

        button800 = (Button) findViewById(R.id.eightHundredTakaButtonId);
        button800.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EightHundredTakaActivity.class);
                startActivity(intent);
            }
        });

        button1000 = (Button) findViewById(R.id.tenHundredTakaButtonId);
        button1000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TenHundredTakaActivity.class);
                startActivity(intent);
            }
        });

        buttonMedicine = (Button) findViewById(R.id.medicineButtonId);
        buttonMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MedicineActivity.class);
                startActivity(intent);
            }
        });

        buttonGynecology = (Button) findViewById(R.id.gaynecologyButtonId);
        buttonGynecology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GaynecologyActivity.class);
                startActivity(intent);
            }
        });

        buttonSurgery = (Button) findViewById(R.id.surgeryButtonId);
        buttonSurgery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SurgeryActivity.class);
                startActivity(intent);
            }
        });

        buttonOrthopedics = (Button) findViewById(R.id.orthopedicsButtonId);
        buttonOrthopedics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OrthopedicsActivity.class);
                startActivity(intent);
            }
        });

        buttonChild = (Button) findViewById(R.id.childButtonId);
        buttonChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChildActivity.class);
                startActivity(intent);
            }
        });

        buttonSkin = (Button) findViewById(R.id.skinButtonId);
        buttonSkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SkinActivity.class);
                startActivity(intent);
            }
        });

        buttonDental = (Button) findViewById(R.id.dentalButtonId);
        buttonDental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DentalActivity.class);
                startActivity(intent);
            }
        });

        buttonEnt = (Button) findViewById(R.id.entButtonId);
        buttonEnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EntActivity.class);
                startActivity(intent);
            }
        });

        buttonEye = (Button) findViewById(R.id.eyeButtonId);
        buttonEye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EyeActivity.class);
                startActivity(intent);
            }
        });

        buttonCardiology = (Button) findViewById(R.id.cardiologyButtonId);
        buttonCardiology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CardiologyActivity.class);
                startActivity(intent);
            }
        });

        buttonGastroenterology = (Button) findViewById(R.id.gastroenterologyButtonId);
        buttonGastroenterology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GastroenterologyActivity.class);
                startActivity(intent);
            }
        });

        buttonOncology = (Button) findViewById(R.id.oncologyButtonId);
        buttonOncology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OncologyActivity.class);
                startActivity(intent);
            }
        });

        buttonNeurology = (Button) findViewById(R.id.neurologyButtonId);
        buttonNeurology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NeurologyActivity.class);
                startActivity(intent);
            }
        });

        buttonRheumatology = (Button) findViewById(R.id.rheumatologyButtonId);
        buttonRheumatology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RheumatologyActivity.class);
                startActivity(intent);
            }
        });

        buttonEndocrinology = (Button) findViewById(R.id.endocrinologyButtonId);
        buttonEndocrinology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EndocrinologyActivity.class);
                startActivity(intent);
            }
        });

        buttonUrology = (Button) findViewById(R.id.urologyButtonId);
        buttonUrology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UrologyActivity.class);
                startActivity(intent);
            }
        });



        buttonProfessor = (Button) findViewById(R.id.professorButtonId);
        buttonProfessor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfessorActivity.class);
                startActivity(intent);
            }
        });

        buttonAssociateProfessor = (Button) findViewById(R.id.associateProfessorButtonId);
        buttonAssociateProfessor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AssociateProfessorActivity.class);
                startActivity(intent);
            }
        });

        buttonAssistantProfessor = (Button) findViewById(R.id.assistantProfessorButtonId);
        buttonAssistantProfessor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AssistantProfessorActivity.class);
                startActivity(intent);
            }
        });

        buttonConsultant = (Button) findViewById(R.id.consultantButtonId);
        buttonConsultant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConsultantActivity.class);
                startActivity(intent);
            }
        });

        buttonMedicalOfficer = (Button) findViewById(R.id.medicalOfficerButtonId);
        buttonMedicalOfficer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MedicalOfficerActivity.class);
                startActivity(intent);
            }
        });








    }
}
