package th.ac.bsru.arngkhumhong.ramet.bsruservice;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    // Control

        registerControl();
        content1Control();
        content1Contro2();

    }   //Main Method

    //register
    private void registerControl() {
        TextView textView = getView().findViewById(R.id.txtRegister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //  Replace Fragment
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.layoutMainFragment, new RegisterFragment())
                        .addToBackStack(null)
                        .commit();

            }
        });
    }

//    content1
    private void content1Control() {
    TextView textView = getView().findViewById(R.id.txtContent1);
    textView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //  Replace Fragment
            getActivity()
                    .getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.layoutMainFragment, new Content1Fragment())
                    .addToBackStack(null)
                    .commit();

        }
    });
}


//    content2
    private void content1Contro2() {
    TextView textView = getView().findViewById(R.id.txtContent2);
    textView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //  Replace Fragment
            getActivity()
                    .getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.layoutMainFragment, new Content2Fragment())
                    .addToBackStack(null)
                    .commit();

        }
    });
}



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

}
