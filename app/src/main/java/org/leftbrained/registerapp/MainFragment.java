//package org.leftbrained.registerapp;
//
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//public class MainFragment extends Fragment {
//    TextView login;
//    TextView pass;
//
//    public MainFragment() {
//
//    }
//
//    public static MainFragment newInstance() {
//        MainFragment fragment = new MainFragment();
//        Bundle args = new Bundle();
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_main, container, false);
//        login = view.findViewById(R.id.enteredLogin);
//        pass = view.findViewById(R.id.enteredPass);
//        System.out.println(login.getText().toString());
//        System.out.println(pass.getText().toString());
//        return view;
//    }
//
//    public void dataReceived(String log, String pas) {
//        login.setText(log);
//        pass.setText(pas);
//    }
//}