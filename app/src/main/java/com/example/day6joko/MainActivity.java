package com.example.day6joko;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements adapterkopi.OnItemClickListener {


    private RecyclerView recyclerView;
    private adapterkopi adapter;
    private List<kopimodel> kopimodels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rc1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        getData();
        adapter = new adapterkopi(this, kopimodels);
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new adapterkopi.OnItemClickListener() {
            @Override
            public int onItemClick(kopimodel model) {
                // Open detail activity when item clicked
                Intent intent = new Intent(MainActivity.this, detailactivity.class);
                intent.putExtra("KopiModel", String.valueOf(model));
                intent.putExtra("logo", model.getLogo());
                intent.putExtra("desc", model.getDeskripsi());
                intent.putExtra("list", model.getListKopi());
                intent.putExtra("harga", model.getHarga());
                startActivity(intent);
                return 0;
            }

            @Override
            public void onItemClick(int position) {
                // Handle item click if needed
            }
        });
    }

    private void getData() {
        kopimodels = new ArrayList<>();
        kopimodels.add(new kopimodel("GoodDay Chapuchino", R.drawable.gdchapuchino, "Goodday Cappuccino adalah minuman kopi instan yang menggabungkan rasa kopi yang kaya dengan busa susu lembut dan manis. Dirancang untuk memenuhi kebutuhan konsumen yang menginginkan kemudahan dalam menikmati kopi berkualitas, Goodday Cappuccino hadir dalam kemasan praktis yang siap diminum.", 15000));
        kopimodels.add(new kopimodel("GoodDay groovy Chokies", R.drawable.gdcookies, "Goodday Chokies menghadirkan sensasi rasa cokelat yang kaya dan legit, dipadu dengan kelembutan dan kesegaran susu segar. Setiap tegukan memberikan pengalaman menyenangkan bagi lidah, dengan perpaduan sempurna antara manisnya cokelat dan kelezatan susu.", 15000));
        kopimodels.add(new kopimodel("GoodDay Grean Tea Lattecinno", R.drawable.gdgreantea, "Teh hijau memiliki warna dan aroma yang khas, dengan sentuhan beraroma bunga atau herba yang menyegarkan. Minuman ini sering disajikan dalam bentuk panas atau dingin, tergantung pada preferensi individu, dan dapat dinikmati baik tanpa tambahan atau dengan sedikit gula atau madu untuk menyesuaikan rasa.", 15000));
        kopimodels.add(new kopimodel("GoodDay Mochachino", R.drawable.gdmhocachino, "Goodday Mochaccino menawarkan pengalaman minum kopi yang menyenangkan dan menyegarkan, dengan sentuhan manis dari cokelat yang menyatu dengan kehangatan kopi. Produk ini cocok untuk dinikmati sebagai sajian penyegar di pagi atau sore hari, atau bahkan sebagai teman di waktu istirahat.", 15000));
        kopimodels.add(new kopimodel("GoodDay Tiramisu Blis", R.drawable.gdthiramisu, "Goodday Tiramisu Bliss cocok untuk dinikmati sebagai sajian penyegar di pagi atau sore hari, atau sebagai teman yang sempurna di waktu istirahat. Dengan kualitas susu segar dan bahan-bahan berkualitas lainnya, produk ini menjadi pilihan yang populer di kalangan pecinta tiramisu dan minuman susu.", 15000));
        kopimodels.add(new kopimodel("Nescafe Chapuchino", R.drawable.nsccapuchino, "Nescafe Chappuccino hadir dalam kemasan praktis yang memungkinkan Anda menikmati cappuccino berkualitas kapan pun dan di mana pun. Cukup tambahkan air panas ke campuran instan ini, aduk rata, dan Anda akan segera menikmati minuman kopi dengan lapisan busa susu yang lembut.", 16000));
        kopimodels.add(new kopimodel("Nescafe Kopi Caramel", R.drawable.nsccaramel, "Nescafe Kopi Caramel hadir dalam kemasan praktis yang memungkinkan Anda menikmati kopi berkualitas kapan pun dan di mana pun. Campuran instan ini cukup diseduh dengan air panas, aduk rata, dan Anda akan segera menikmati minuman kopi dengan rasa yang kaya dan aroma yang menggoda.", 16000));
        kopimodels.add(new kopimodel("Nescafe Kopi Latte", R.drawable.nsclatte, "Nescafe Kopi Latte hadir dalam kemasan praktis yang memungkinkan Anda menikmati kopi berkualitas dengan cepat dan mudah. Campuran instan ini cukup diseduh dengan air panas, aduk rata, dan Anda akan segera menikmati minuman kopi dengan lapisan susu yang lembut dan krim.", 16000));
        kopimodels.add(new kopimodel("Nescafe Kopi Mocha", R.drawable.nscmocha, "Nescafe Kopi Mocha hadir dalam kemasan instan yang praktis dan mudah disiapkan. Anda cukup menyeduh campuran instan ini dengan air panas, aduk rata, dan Anda akan segera menikmati minuman kopi dengan sentuhan cokelat yang lezat.", 16000));
        kopimodels.add(new kopimodel("Nescafe Original", R.drawable.nscoriginal, "Nescafe Original hadir dalam bentuk serbuk kopi instan yang praktis dan mudah disiapkan. Cukup tambahkan air panas ke dalam segelas, tambahkan beberapa sendok kopi instan Nescafe Original, aduk rata, dan minuman kopi Anda siap dinikmati.", 16000));
        kopimodels.add(new kopimodel("Star Buck Kopi Energi", R.drawable.gdchapuchino, "Starbucks Doubleshot Energy adalah minuman energi yang diproduksi oleh merek kopi terkenal, Starbucks. Minuman ini dirancang khusus untuk memberikan dorongan energi tambahan dengan rasa kopi yang khas dari Starbucks.", 18000));
        kopimodels.add(new kopimodel("Star Buck Double Shot Kopi Latte", R.drawable.gdchapuchino, "Starbucks Doubleshot Espresso adalah minuman yang terdiri dari dua shot espresso yang kuat yang dicampur dengan susu segar. Espresso memberikan rasa kopi yang kaya dan pekat, sementara susu menambahkan kelembutan dan kelezatan pada minuman.", 18000));
        kopimodels.add(new kopimodel("Star Buck Ekspreso", R.drawable.gdchapuchino, "Starbucks Espresso adalah minuman kopi yang terdiri dari satu atau dua shot espresso, tergantung pada pilihan Anda. Espresso sendiri adalah kopi yang dipanggang secara khusus dan diseduh dengan air panas di bawah tekanan tinggi untuk menghasilkan minuman yang kaya, pekat, dan beraroma.", 18000));
        kopimodels.add(new kopimodel("Star Buck Double Shot Mocha", R.drawable.gdchapuchino, "Starbucks Doubleshot Mocha adalah minuman yang terdiri dari dua shot espresso yang kuat yang dicampur dengan susu segar dan sirup mocha. Espresso memberikan rasa kopi yang kaya dan pekat, sementara susu menambahkan kelembutan dan kelezatan pada minuman, dan sirup mocha memberikan sentuhan manis dan cokelat yang lezat.", 18000));
        kopimodels.add(new kopimodel("Star Buck Nitro Cold Brew", R.drawable.gdchapuchino, "Starbucks Nitro Cold Brew adalah minuman kopi yang diseduh dengan dingin (cold brew) dan kemudian ditambahkan nitrogen untuk menciptakan efek berbusa yang lembut dan krimi. Proses penambahan nitrogen memberikan tekstur yang halus dan sensasi mulut yang ringan, hampir seperti minuman beralkohol seperti bir.", 18000));

    }

    @Override
    public int onItemClick(kopimodel model) {
        return 0;
    }

    @Override
    public void onItemClick(int position) {

    }
}