package com.example.alatmusik1;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Tab3.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Tab3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tab3 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    MediaPlayer mp;
    public Tab3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tab3.
     */
    // TODO: Rename and change types and number of parameters
    public static Tab3 newInstance(String param1, String param2) {
        Tab3 fragment = new Tab3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView= inflater.inflate(R.layout.fragment_tab3, container, false);
        final LinearLayout btnKecapi = (LinearLayout) rootView.findViewById(R.id.btn_kecapi);
        LinearLayout btnPanting = (LinearLayout) rootView.findViewById(R.id.btn_panting);
        LinearLayout btnSasando = (LinearLayout) rootView.findViewById(R.id.btn_sasando);
        LinearLayout btnSapesampek = (LinearLayout) rootView.findViewById(R.id.btn_sapesampek);
        LinearLayout btnSiter = (LinearLayout) rootView.findViewById(R.id.btn_siter);
        final TextView pengertianTv = (TextView) rootView.findViewById(R.id.perngertianTv);
        final TextView sejarahTv = (TextView) rootView.findViewById(R.id.sejarahTv);
        final ImageView imgAlat = (ImageView) rootView.findViewById(R.id.img_tarawangsa);
        final TextView titleTv = (TextView) rootView.findViewById(R.id.titleTv);
        final ImageView imgButton = (ImageView) rootView.findViewById(R.id.play_btn);
        imgButton.setImageResource(R.drawable.ic_sound_48);
        mp = MediaPlayer.create(getActivity(), R.raw.kecapi);
        imgButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp.start();
                imgButton.setImageResource(R.drawable.ic_mute_48);
                imgButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mp.stop();
                        imgButton.setImageResource(R.drawable.ic_sound_48);
                    }
                });
            }
        });
        //karinding
        btnPanting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.panting);
                titleTv.setText("PANTING");
                pengertianTv.setText(R.string.panting);
                sejarahTv.setText(R.string.panting_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.pantin);
                imgButton.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        mp.start();
                        imgButton.setImageResource(R.drawable.ic_mute_48);
                        imgButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mp.stop();
                                imgButton.setImageResource(R.drawable.ic_sound_48);
                                return;
                            }
                        });
                    }
                });
            }
        });
        //Tarawangsa
        btnKecapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.kecapi);
                titleTv.setText("KECAPI");
                pengertianTv.setText(R.string.kecapi);
                sejarahTv.setText(R.string.kecapi_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.kecapi);
                imgButton.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        mp.start();
                        imgButton.setImageResource(R.drawable.ic_mute_48);
                        imgButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mp.stop();
                                imgButton.setImageResource(R.drawable.ic_sound_48);
                            }
                        });
                    }
                });
            }
        });
        btnSasando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.sasando);
                titleTv.setText("SASANDO");
                pengertianTv.setText(R.string.sasando);
                sejarahTv.setText(R.string.sasando_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.sasando);
                imgButton.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        mp.start();
                        imgButton.setImageResource(R.drawable.ic_mute_48);
                        imgButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mp.stop();
                                imgButton.setImageResource(R.drawable.ic_sound_48);
                            }
                        });
                    }
                });
            }
        });
        btnSapesampek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.sape_sampek);
                titleTv.setText("SAPE SAMPEK");
                pengertianTv.setText(R.string.sapesampek);
                sejarahTv.setText(R.string.sapesampek_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.sape);
                imgButton.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        mp.start();
                        imgButton.setImageResource(R.drawable.ic_mute_48);
                        imgButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mp.stop();
                                imgButton.setImageResource(R.drawable.ic_sound_48);
                            }
                        });
                    }
                });
            }
        });
        btnSiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.siter);
                titleTv.setText("SITER");
                pengertianTv.setText(R.string.siter);
                sejarahTv.setText(R.string.siter_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.siter);
                imgButton.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        mp.start();
                        imgButton.setImageResource(R.drawable.ic_mute_48);
                        imgButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mp.stop();
                                imgButton.setImageResource(R.drawable.ic_sound_48);
                            }
                        });
                    }
                });
            }
        });
        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
