package com.example.android.taller2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.content.res.Resources;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private EditText cantidadZapatos;
    private EditText valorCompra;
    private Resources resources;
    private Spinner sexo;
    private Spinner tipoZapato;
    private Spinner marca;
    private String Sex[];
    private String TipoZapat[];
    private String Mark[];
    private ArrayAdapter<String> adapter, adapter1, adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cantidadZapatos = (EditText) findViewById(R.id.lblCantidad);
        valorCompra = (EditText) findViewById(R.id.lblTotal);
        sexo = (Spinner) findViewById(R.id.cmbSexo);
        marca = (Spinner) findViewById(R.id.cmbMarca);
        tipoZapato = (Spinner) findViewById(R.id.cmbTipoZapato);
        resources = this.getResources();
        Sex = resources.getStringArray(R.array.Sex);
        TipoZapat = resources.getStringArray(R.array.TipoZapat);
        Mark = resources.getStringArray(R.array.Mark);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Sex);
        sexo.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Mark);
        marca.setAdapter(adapter1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, TipoZapat);
        tipoZapato.setAdapter(adapter2);

    }

    public boolean validar(){

        if(cantidadZapatos.getText().toString().isEmpty()){
            cantidadZapatos.setError(resources.getString(R.string.msm_error));
            return false;
        }

        return true;
    }

    public void calcular(View v) {
        int precio = 0,  total=0,cant;
        cant = Integer.parseInt(cantidadZapatos.getText().toString());



            if (   (sexo.getSelectedItemPosition() == 0) && (tipoZapato.getSelectedItemPosition() == 0) && (marca.getSelectedItemPosition() == 0)) {
                precio = 120000;
            } else if ((sexo.getSelectedItemPosition() == 0) && (tipoZapato.getSelectedItemPosition() == 0) && (marca.getSelectedItemPosition() == 1)) {
                precio = 140000;
            } else if ((sexo.getSelectedItemPosition() == 0) && (tipoZapato.getSelectedItemPosition() == 0) && (marca.getSelectedItemPosition() == 2)) {
                precio = 130000;
            } else if ((sexo.getSelectedItemPosition() == 0) && (tipoZapato.getSelectedItemPosition() == 1) && (marca.getSelectedItemPosition() == 0)) {
                precio = 50000;
            } else if ((sexo.getSelectedItemPosition() == 0) && (tipoZapato.getSelectedItemPosition() == 1) && (marca.getSelectedItemPosition() == 1)) {
                precio = 80000;
            } else if ((sexo.getSelectedItemPosition()== 0) && (tipoZapato.getSelectedItemPosition() == 1) && (marca.getSelectedItemPosition() == 2)) {
                precio = 100000;
            } else if ((sexo.getSelectedItemPosition() == 1) && (tipoZapato.getSelectedItemPosition() == 0) && (marca.getSelectedItemPosition() == 0)) {
                precio = 100000;
            } else if ((sexo.getSelectedItemPosition() == 1 && (tipoZapato.getSelectedItemPosition() == 0) && (marca.getSelectedItemPosition() == 1))) {
                precio = 130000;
            } else if ((sexo.getSelectedItemPosition() == 1 && (tipoZapato.getSelectedItemPosition() == 0) && (marca.getSelectedItemPosition() == 2))) {
                precio = 110000;
            } else if ((sexo.getSelectedItemPosition() == 1 && (tipoZapato.getSelectedItemPosition() == 1) && (marca.getSelectedItemPosition() == 0))) {
                precio = 60000;
            }else if ((sexo.getSelectedItemPosition() == 1 && (tipoZapato.getSelectedItemPosition() == 1) && (marca.getSelectedItemPosition() == 1))) {
                precio = 70000;
            }else if ((sexo.getSelectedItemPosition() == 1 && (tipoZapato.getSelectedItemPosition() == 1) && (marca.getSelectedItemPosition() == 2))) {
                precio = 120000;
            }
            total=precio*cant;

            valorCompra.setText("" + (total));


    }


    public void borrar(View v){
        cantidadZapatos.setText("");
        valorCompra.setText("");
        cantidadZapatos.requestFocus();
        valorCompra.requestFocus();
        sexo.setSelection(0);
        tipoZapato.setSelection(0);
        marca.setSelection(0);

    }

}
