package com.example.controledechamadosapp.Helpers;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.controledechamadosapp.Model.Chamado;
import com.example.controledechamadosapp.R;

import java.util.List;

public class ChamadosAdapterPersonalizado extends BaseAdapter {

    private final List<Chamado> adpterList;
    private final Activity activity;

    public ChamadosAdapterPersonalizado(List<Chamado> adpterList, Activity activity) {
        this.adpterList = adpterList;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return this.adpterList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.adpterList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = this.activity.getLayoutInflater()
                .inflate(R.layout.activity_item_chamado_personalizado, parent, false);

        Chamado chamado = this.adpterList.get(position);

        TextView assunto = (TextView) view.findViewById(R.id.lvpersonalizada_chamado_assunto);
        TextView descricao = (TextView) view.findViewById(R.id.lvpersonalizada_chamado_descricao);

        assunto.setText(chamado.getAssunto());
        descricao.setText(chamado.getDescricao());

        return view;
    }
}
