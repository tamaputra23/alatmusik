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
 * {@link Tab1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Tab1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tab1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    LinearLayout btn_Tarawangsa;
    private OnFragmentInteractionListener mListener;
    MediaPlayer mp;
    Context ctx;

    public Tab1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tab1.
     */
    // TODO: Rename and change types and number of parameters
    public static Tab1 newInstance(String param1, String param2) {
        Tab1 fragment = new Tab1();
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
        final View rootView = inflater.inflate(R.layout.fragment_tab1, container, false);
        final LinearLayout btnTerawangsa = (LinearLayout) rootView.findViewById(R.id.btn_Terawangsa);
        LinearLayout btnKesokeso = (LinearLayout) rootView.findViewById(R.id.btn_kesokeso);
        LinearLayout btnRebab = (LinearLayout) rootView.findViewById(R.id.btn_rebab);
        LinearLayout btnTehyan = (LinearLayout) rootView.findViewById(R.id.btn_tehyan);
        LinearLayout btnRabab = (LinearLayout) rootView.findViewById(R.id.btn_rabab);
        final TextView pengertianTv = (TextView) rootView.findViewById(R.id.perngertianTv);
        final TextView sejarahTv = (TextView) rootView.findViewById(R.id.sejarahTv);
        final ImageView imgAlat = (ImageView) rootView.findViewById(R.id.img_tarawangsa);
        final TextView titleTv = (TextView) rootView.findViewById(R.id.titleTv);
        final ImageView imgButton = (ImageView) rootView.findViewById(R.id.play_btn);

        imgButton.setImageResource(R.drawable.ic_sound_48);
        mp = MediaPlayer.create(getActivity(), R.raw.tarawangsa);
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
        btnKesokeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.keso_keso);
                titleTv.setText("KESO-KESO");
                pengertianTv.setText(R.string.kesokeso);
                sejarahTv.setText(R.string.kesokeso_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.kesokeso);
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
        btnTerawangsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.alatmusiktarawangsa);
                titleTv.setText("TARAWANGSA");
                pengertianTv.setText(R.string.tarawangsa);
                sejarahTv.setText(R.string.tarawangsa_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.tarawangsa);
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
        btnRebab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.rebab);
                titleTv.setText("REBAB");
                pengertianTv.setText(R.string.rebab);
                sejarahTv.setText(R.string.rebab_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.rebab);
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
        btnTehyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.tehyan);
                titleTv.setText("TEHYAN");
                pengertianTv.setText(R.string.tehyan);
                sejarahTv.setText(R.string.tehyan_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.tehyan);
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
        btnRabab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAlat.setImageResource(R.drawable.rabab);
                titleTv.setText("RABAB");
                pengertianTv.setText(R.string.rabab);
                sejarahTv.setText(R.string.rabab_sj);
                imgButton.setImageResource(R.drawable.ic_sound_48);
                mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.rabab);
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
