package com.example.AllFeatureAndroid.Model;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.AllFeatureAndroid.R;

import java.util.Vector;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    private Vector<User> userVector= new Vector<>();

    public UserAdapter(Vector<User> userVector) {
        this.userVector = userVector;
    }

    @NonNull
    @Override
    public UserAdapter.UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view= layoutInflater.inflate(R.layout.activity_card_item,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.UserViewHolder holder, int position) {
        holder.dob.setText(userVector.get(position).getDOB());
        holder.name.setText(userVector.get(position).getName());
        holder.age.setText(String.valueOf(userVector.get(position).getAge()));

    }

    @Override
    public int getItemCount() {
        return (userVector!=null)?userVector.size():0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        private TextView name,age,dob;

        public UserViewHolder(View view) {
            super(view);
            name= view.findViewById(R.id.name_id);
            age= view.findViewById(R.id.age_tv);
            dob= view.findViewById(R.id.DOB_tv);
        }
    }
}
