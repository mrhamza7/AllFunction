package com.mrhamza.loginfirebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.ktx.Firebase;
import com.mrhamza.loginfirebase.databinding.ActivitySignUpBinding;

public class SignUp extends AppCompatActivity {
    ActivitySignUpBinding binding;

//    FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.signUpTvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignUp.this, LogIn.class);
                startActivity(i);
            }
        });
    }
}
//        binding.signUpTvSignIn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String email ,password,number;
//                email=String.valueOf(binding.etEmailSignUp.getText());
//                password=String.valueOf(binding.etPasswordSignUp.getText());
//                number=String.valueOf(binding.etNumberSignUp.getText());
//
//                 if(TextUtils.isEmpty(email)){
//                     Toast.makeText(SignUp.this, "Enter Email", Toast.LENGTH_SHORT).show();
//                     return;
//                 }
//                 if (TextUtils.isEmpty(password)){
//                     Toast.makeText(SignUp.this, "Enter Password", Toast.LENGTH_SHORT).show();
//                     return;
//                 }
//                 if (TextUtils.isEmpty(number)){
//                     Toast.makeText(SignUp.this, "Enter Number", Toast.LENGTH_SHORT).show();
//                     return;
//                 }
//                 firebaseAuth.signInWithEmailAndPassword(email,password)
//                         .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                             @Override
//                             public void onComplete(@NonNull Task<AuthResult> task) {
//                                 if(task.isSuccessful()){
//                                     Toast.makeText(SignUp.this, "Sign Up Successful", Toast.LENGTH_SHORT).show();
//                                     Intent i=new Intent(SignUp.this, LogIn.class);
//                                     startActivity(i);
//                                     finish();
//                                 }
//                                 else {
//                                     Toast.makeText(SignUp.this, "Authentication Failed", Toast.LENGTH_SHORT).show();
//                                 }
//                             }
//                         });

//            }
//        });
//