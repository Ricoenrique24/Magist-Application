CREATE TABLE `barang` (
  `id_barang` smallint PRIMARY KEY,
  `nama_barang` varchar(255),
  `harga_beli` float,
  `harga_jual` float,
  `jumlah_barang` int,
  `satuan_barang` varchar(255)
);

CREATE TABLE `transaksi` (
  `id_transaksi` int,
  `id_barang` int,
  `id_pembeli` int,
  `tanggal` date,
  `keterangan` varchar(255)
);

CREATE TABLE `keuntungan` (
  `tanggal` date,
  `keuntungan_harian` varchar(255)
);

CREATE TABLE `keranjang` (
  `id` varchar(255),
  `password` varchar(255)
);
