If(
isnothing(From d In  inOut_DT_MasterData.AsEnumerable Group Join m In  in_DT_HistoryData.AsEnumerable On d("Invoice No.").tostring Equals m("Invoice No.").tostring Into  gj = Group
From g In  gj.DefaultIfEmpty
Where g Is Nothing Select d) Or (From d In   inOut_DT_MasterData.AsEnumerable Group Join m In   in_DT_HistoryData.AsEnumerable On d("Invoice No.").tostring Equals m("Invoice No.").tostring Into  gj = Group
From g In  gj.DefaultIfEmpty
Where g Is Nothing Select d).count=0,
inOut_DT_MasterData.clone,
(From d In  inOut_DT_MasterData.AsEnumerable Group Join m In  in_DT_HistoryData.AsEnumerable.AsEnumerable On d("Invoice No.").tostring Equals m("Invoice No.").tostring Into  gj = Group
From g In  gj.DefaultIfEmpty
Where g Is Nothing Select d).CopyToDataTable())