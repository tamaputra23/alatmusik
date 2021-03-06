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
 * {@link Tab4.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Tab4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tab4 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    MediaPlayer mp;
    private OnFragmentInteractionListener mListener;

    public Tab4() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tab4.
     */
    // TODO: Rename and change types and number of parameters
    public static Tab4 newInstance(String param1, String param2) {
        Tab4 fragment = new Tab4();
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
        final View rootView = inflater.inflate(R.layout.fragment_tab4, container, false);
        final LinearLayout btnRebana = (LinearLayout) rootView.findViewById(R.id.btn_rebana);
        LinearLayout btnKolintang = (LinearLayout) rootView.findViewById(R.id.btn_kolintang);
        LinearLayout btnTalempong = (LinearLayout) rootView.findViewById(R.id.btn_talempong);
        LinearLayout btnSaron = (LinearLayout) rootView.findViewById(R.id.btn_saron);
        LinearLayout btnGambang = (LinearLayout) rootView.findViewById(R.id.btn_gambang);
        final TextView pengertianTv = (TextView) rootView.findViewById(R.id.perngertianTv);
        final TextView sejarahTv = (TextView) rootView.findViewById(R.id.sejarahTv);
        final ImageView imgAlat = (ImageView) rootView.findViewById(R.id.img_tarawangsa);
        final TextView titleTv = (TextView) rootView.findViewById(R.id.titleTv);
        final ImageView imgButton = (ImageView) rootView.findViewById(R.id.play_btn);
        imgButton.setImageResource(R.drawable.ic_sound_48);
        mp = MediaPlayer.create(getActivity(), R.raw.rebana);
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
        btnKolintang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.kolintang);
                titleTv.setText("KOLINTANG");
                pengertianTv.setText(R.string.kolintang);
                sejarahTv.setText(R.string.kolintang_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.kolintang);
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
        btnRebana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.alat_musik_rebana);
                titleTv.setText("REBANA");
                pengertianTv.setText(R.string.rebana);
                sejarahTv.setText(R.string.rebana_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.rebana);
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
        btnTalempong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.talempong);
                titleTv.setText("TALEMPONG");
                pengertianTv.setText(R.string.talempong);
                sejarahTv.setText(R.string.talempong_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.talempong);
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
        btnSaron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.saron);
                titleTv.setText("SARON");
                pengertianTv.setText(R.string.saron);
                sejarahTv.setText(R.string.saron_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.saron);
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
        btnGambang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.gambang);
                titleTv.setText("GAMBANG");
                pengertianTv.setText(R.string.gambang);
                sejarahTv.setText(R.string.gambang_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.gambang);
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
