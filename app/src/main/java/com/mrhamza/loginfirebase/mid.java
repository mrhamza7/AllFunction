package com.mrhamza.loginfirebase;

import static com.basgeekball.awesomevalidation.ValidationStyle.BASIC;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;
import com.google.android.material.textfield.TextInputLayout;
import com.mrhamza.loginfirebase.databinding.ActivityMidBinding;


public class mid extends AppCompatActivity {
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("Are you sure You want to Exist? ")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        mid.super.onBackPressed();

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();

    }

    ActivityMidBinding binding;
    TextInputLayout ed1,ed2,ed3,ed4,ed5;
    Button btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMidBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());






//        ed1=findViewById(R.id.et1_full_name_mid);
//        ed2=findViewById(R.id.et2_email_mid);
//        ed3=findViewById(R.id.et3_password_mid);
//        ed4=findViewById(R.id.et4_confirm_password_mid);
//        ed5=findViewById(R.id.et5_phone_no_mid);
//        btnSignUp=findViewById(R.id.btn1_sign_up_mid);



//        btnSignUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                final String fullName=ed1.getEditText().toString();
//                final String email=ed2.getEditText().toString();
//                final String password=ed3.getEditText().toString();
//                final String cPassword=ed4.getEditText().toString();
//                final String cNumber=ed5.getEditText().toString();
//
//                if(fullName.isEmpty() || email.isEmpty() || password.isEmpty() ||
//                        cPassword.isEmpty() || cNumber.isEmpty())
//                {
//                    Toast.makeText(mid.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
//                }
//                else if (!password.equals(cPassword)) {
//                    Toast.makeText(mid.this, "Passwords are not matching", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });



//        binding.btn1SignUpMid.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(mid.this, "Sign Up Successfully", Toast.LENGTH_SHORT).show();
//            }
//        });
        
        binding.btn1SignUpMid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=binding.et1FullNameMid.getEditableText().toString();
                String email=binding.et2EmailMid.getEditableText().toString();
                String password=binding.et3PasswordMid.getEditableText().toString();
                String cPassword=binding.et4ConfirmPasswordMid.getEditableText().toString();
                String number=binding.et5PhoneNoMid.getEditableText().toString();

//                 name.isEmpty() || email.isEmpty() || password.isEmpty() || cPassword.isEmpty()|| number.isEmpty()

                if (TextUtils.isEmpty(name) || name.length() <10)
                {
                    Toast.makeText(mid.this, "Please enter the full name ", Toast.LENGTH_SHORT).show();
                    binding.et1FullNameMid.setError("Full Name is Required!");
                    binding.et1FullNameMid.requestFocus();
                }
                else if (TextUtils.isEmpty(email) || email.length() <10) {
                    Toast.makeText(mid.this, "Please enter Email", Toast.LENGTH_SHORT).show();
                    binding.et2EmailMid.setError("Email is Required!");
                    binding.et2EmailMid.requestFocus();
                }
                else if (TextUtils.isEmpty(password) || password.length() <8) {
                    Toast.makeText(mid.this, "Please enter Password", Toast.LENGTH_SHORT).show();
                    binding.et3PasswordMid.setError("At least 8 digits Password is Required!");
                    binding.et3PasswordMid.requestFocus();
                }
                else if (TextUtils.isEmpty(cPassword))
                {
                    Toast.makeText(mid.this, "Please Confirm Password", Toast.LENGTH_SHORT).show();
                    binding.et4ConfirmPasswordMid.setError("Confirm Password is Required!");
                    binding.et4ConfirmPasswordMid.requestFocus();
                }
                else if (!password.equals(cPassword))
                {
                    Toast.makeText(mid.this, "", Toast.LENGTH_SHORT).show();
                    binding.et4ConfirmPasswordMid.setError("Password Not Matches ");
                    binding.et4ConfirmPasswordMid.requestFocus();

                } else if (TextUtils.isEmpty(number) )
                {
                    Toast.makeText(mid.this, "Please enter Contact Number", Toast.LENGTH_SHORT).show();
                    binding.et5PhoneNoMid.setError(" 11 digits number required !");
                    binding.et5PhoneNoMid.requestFocus();
                } else
                {
                    Toast.makeText(mid.this, "Sign Up Successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.tvMidSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(mid.this, LogIn.class);
                startActivity(i);
            }
        });

    }
}