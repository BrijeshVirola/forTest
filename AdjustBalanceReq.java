package tests.balanceservices.request;

import java.util.Map;

import common.FlakeGenerator;
import common.TransactionType;
import common.enumsconstants.Constants;
import common.enumsconstants.UsersId;
import tests.balanceservices.requestobjects.GetExternalBalanceChange;

public class AdjustBalanceReq {

	@SuppressWarnings("unused") 
	private String Method;
	@SuppressWarnings("unused") 
	private String ID;
	@SuppressWarnings("unused") 
	private GetUserBalanceParams Params;
	@SuppressWarnings("unused") 
	private GetExternalBalanceChange getExternalBalanceChange;

	public AdjustBalanceReq(Builder builder) { 
		ID = builder.id; 
		Method = builder.method; 
		Params = new GetUserBalanceParams(builder);
		getExternalBalanceChange = builder.getExternalBalanceChange;

		//Params = formatParams(Params, builder.transactionTypeID);
	}

	public static class Builder {

		private String id; 
		private String method; 
		private Long flake_id; 
		private String real_amount; 
		private String bonus_amount;
		private String ring_fenced_amount; 
		private String total_amount; 
		private String bonus_game_type; 
		private Integer user_id; 
		private Integer cmscore_game_id; 
		private Integer regulated_game_id; 
		private TransactionType transaction_type_id; 
		private String partner_transaction_id;
		private String partner_timestamp_utc;
		private Integer partner_id;
		private Long game_round_id;
		private Integer product_id;
		private String token;
		private Integer action_type_id;
		private Integer provider_region_id;
		private Boolean allow_bonus;
		private Boolean allow_ring_fenced;
		private Integer currency_id;
		private long bet365_transaction_id;
		private Integer user_bonus_id;
		private Long source_bet365_games_transaction_id;
		private GetExternalBalanceChange getExternalBalanceChange;

		public Builder id(String id) { 
			this.id = id; 
			return this; 
		}

		public Builder method(String method) { 
			this.method = method; 
			return this; 
		}

		public Builder flakeId(Long flakeId) { 
			this.flake_id = flakeId; 
			return this; 
		}

		public Builder realAmount(String realAmount) { 
			this.real_amount = realAmount; 
			return this; 
		}

		public Builder bonusAmount(String bonus_amount) {
			this.bonus_amount = bonus_amount; 
			return this; 
		}

		public Builder ringFencedAmount(String ring_fenced_amount) {
			this.ring_fenced_amount = ring_fenced_amount; 
			return this; 
		}


		public Builder totalAmount(String totalAmount) { 
			this.total_amount = totalAmount; 
			return this; 
		}

		public Builder bonusGameType(String bonusGameType) { 
			this.bonus_game_type = bonusGameType; 
			return this; 
		}

		public Builder userId(Integer userId) { 
			this.user_id = userId; 
			return this; 
		}

		public Builder cmscoreGameId(Integer cmscoreGameId) { 
			this.cmscore_game_id = cmscoreGameId; 
			return this; 
		}

		public Builder regulatedGameId(Integer regulatedGameId) { 
			this.regulated_game_id = regulatedGameId; 
			return this; 
		}

		public Builder transactionTypeId(TransactionType transactionTypeId) { 
			this.transaction_type_id = transactionTypeId; 
			return this; 
		}

		public Builder partnerTransactionId(String partnerTransactionId) { 
			this.partner_transaction_id = partnerTransactionId; 
			return this; 
		}

		public Builder partnerTimestampUtc(String partnerTimestampUtc) { 
			this.partner_timestamp_utc = partnerTimestampUtc; 
			return this; 
		}

		public Builder partnerId(Integer partnerId) { 
			this.partner_id = partnerId;
			return this;
		}

		public Builder gameRoundId(Long gameRoundId) { 
			this.game_round_id = gameRoundId;
			return this;
		}

		public Builder productId(Integer productId) { 
			this.product_id = productId;
			return this;
		}

		public Builder token(String token) { 
			this.token = token; 
			return this; 
		}

		public Builder actionTypeId(Integer actionTypeId) { 
			this.action_type_id = actionTypeId;
			return this;
		}

		public Builder providerRegionId(Integer providerRegionId) { 
			this.provider_region_id = providerRegionId;
			return this;
		}

		public Builder allowBonus(Boolean allowBonus) { 
			this.allow_bonus = allowBonus; 
			return this;
		}

		public Builder allowRingFenched(Boolean allowRingFenched) { 
			this.allow_ring_fenced = allowRingFenched; 
			return this;
		}

		public Builder currencyId(Integer currencyId) { 
			this.currency_id = currencyId;
			return this;
		}

		public Builder bet365TransactionId(Long bet365TransactionId) { 
			this.bet365_transaction_id = bet365TransactionId;
			return this;
		}

		public Builder userBonusId(Integer userBonusId) { 
			this.user_bonus_id = userBonusId;
			return this;
		}

		public Builder sourceBet365GamesTransactionId(Long sourceBet365GamesTransactionId) { 
			this.source_bet365_games_transaction_id = sourceBet365GamesTransactionId;
			return this;
		}

		public Builder defaults() {
			this.method = "adjustbalance"; 
			this.id = "defaultId";
			this.flake_id = FlakeGenerator.nextId(Constants.nodeId);
			this.real_amount = "0.00";
			this.bonus_amount = "0.00";
			this.ring_fenced_amount = "0.00";
			this.total_amount = "-1.00";
			this.bonus_game_type = "G";
			this.user_id = UsersId.GO_SVC_TESTS03;
			this.cmscore_game_id = 2885;
			this.regulated_game_id = 6403;
			this.transaction_type_id = TransactionType.STAKE;
			this.partner_transaction_id = "Transaction" + flake_id;
			this.partner_timestamp_utc = "2020-09-22T14:54:33.86Z";
			this.partner_id = 4567;
			this.game_round_id = 1234L;
			this.product_id = 4;
			this.token = "private token";
			this.action_type_id = 1;
			this.provider_region_id = 5678;
			this.allow_bonus = true;
			this.allow_ring_fenced = true;
			this.currency_id = 1;
			this.bet365_transaction_id = -1;
			this.user_bonus_id = 0;
			this.source_bet365_games_transaction_id = -1L;
			return this; 
		}

		public AdjustBalanceReq build() { 
			return new AdjustBalanceReq(this); 
		} 
	}

	public static Map<String, Object> formatParams(Map<String, Object> Params, TransactionType transactionType) {

		switch (transactionType) {
		case INSTANT_GAMES_STAKE:
			Params.remove("source_bet365_games_transaction_id");
			Params.remove("ring_fenced_amount");
			Params.remove("bonus_amount");
			Params.remove("user_bonus_id");
			break;

		case INSTANT_GAMES_RETURN:	
		case GAMING_PRIZE_AWARD:
		case CASH_DROP_AWARD:
		case TOURNAMENT_AWARD:
			Params.remove("user_bonus_id");
			Params.remove("bet365_transaction_id");
			break;

		case STAKE:
		case FREE_SPIN_STAKE:
		case GOLDEN_CHIP_STAKE:
		case GAMING_STAKE:
		case TRANSFER_TO_PLAYTECH_BONUS_CASINO:
		case TRANSFER_TO_BINGO_BONUS_BALANCE:
		case TRANSFER_TO_PLAYTECH_BONUS_LIVE_CASINO:
		case POKER_BUY_CHIPS:
		case POKER_TOURNAMENT_ENTRY:
		case POKER_TOURNAMENT_REBUY:
		case TRANSFER_TO_PLAYTECH_BONUS_POKER:
			Params.remove("source_bet365_games_transaction_id");
			Params.remove("ring_fenced_amount");
			Params.remove("bonus_amount");
			break;

		case VOID_STAKE:
		case VOID_GAMING_STAKE:
		case VOID_POKER_BUY_CHIPS:
		case VOID_POKER_TOURNAMENT_ENTRY:
		case VOID_POKER_TOURNAMENT_REBUY:
		case VOID_INSTANT_GAMES_STAKE:
			Params.remove("bet365_transaction_id");
			Params.remove("allow_ring_fenced");
			Params.remove("allow_bonus");
			break;

		case RETURN:
		case FREE_SPIN_RETURN:
		case GOLDEN_CHIP_RETURN:
		case GAMING_RETURN:
		case TRANSFER_FROM_BINGO_BONUS_BALANCE:
		case TRANSFER_FROM_PLAYTECH_BONUS_CASINO:
		case TRANSFER_FROM_PLAYTECH_BONUS_LIVE_CASINO:
		case POKER_SELL_CHIPS:
		case POKER_TOURNAMENT_WIN:
		case TRANSFER_FROM_PLAYTECH_BONUS_POKER:
			Params.remove("bet365_transaction_id");
			break;
		default:
			break;
		}

		return Params;
	}

	private class GetUserBalanceParams {

		@SuppressWarnings("unused") 
		private Long flake_id;
		@SuppressWarnings("unused")
		private String real_amount;
		@SuppressWarnings("unused")
		private String total_amount;
		@SuppressWarnings("unused")
		private String bonus_amount;
		@SuppressWarnings("unused")
		private String ring_fenced_amount;
		@SuppressWarnings("unused")
		private String bonus_game_type; 
		@SuppressWarnings("unused")
		private Integer user_id;
		@SuppressWarnings("unused")
		private Integer cmscore_game_id;
		@SuppressWarnings("unused")
		private Integer regulated_game_id; 
		@SuppressWarnings("unused")
		private Integer transaction_type_id; 
		@SuppressWarnings("unused")
		private String partner_transaction_id;
		@SuppressWarnings("unused")
		private String partner_timestamp_utc;
		@SuppressWarnings("unused")
		private Integer partner_id;
		@SuppressWarnings("unused")
		private Long game_round_id;
		@SuppressWarnings("unused")
		private Integer product_id;
		@SuppressWarnings("unused")
		private String token;
		@SuppressWarnings("unused")
		private Integer action_type_id;
		@SuppressWarnings("unused")
		private Integer provider_region_id;
		@SuppressWarnings("unused")
		private Boolean allow_bonus;
		@SuppressWarnings("unused")
		private Boolean allow_ring_fenced;
		@SuppressWarnings("unused")
		private Integer currency_id;
		@SuppressWarnings("unused")
		private long bet365_transaction_id;
		@SuppressWarnings("unused")
		private Integer user_bonus_id;
		@SuppressWarnings("unused")
		private Long source_bet365_games_transaction_id;
		@SuppressWarnings("unused")
		private GetExternalBalanceChange getExternalBalanceChange;

		public GetUserBalanceParams(Builder builder) { 
			this.flake_id = builder.flake_id; 
			this.real_amount = builder.real_amount;
			this.total_amount = builder.total_amount;
			this.bonus_game_type = builder.bonus_game_type;
			this.bonus_amount = builder.bonus_amount;
			this.ring_fenced_amount = builder.ring_fenced_amount;
			this.user_bonus_id = builder.user_id;
			this.user_id = builder.user_id;
			this.cmscore_game_id = builder.cmscore_game_id;
			this.regulated_game_id = builder.regulated_game_id;
			this.transaction_type_id = builder.transaction_type_id.getValue();
			this.partner_transaction_id = builder.partner_transaction_id;
			this.partner_timestamp_utc = builder.partner_timestamp_utc;
			this.partner_id = builder.partner_id;
			this.game_round_id = builder.game_round_id;
			this.product_id = builder.product_id;
			this.token = builder.token;
			this.action_type_id = builder.action_type_id;
			this.provider_region_id = builder.provider_region_id;
			this.allow_bonus = builder.allow_bonus;
			this.allow_ring_fenced = builder.allow_ring_fenced;
			this.currency_id = builder.currency_id;
			this.bet365_transaction_id = builder.bet365_transaction_id;
			this.user_bonus_id = builder.user_bonus_id;
			this.source_bet365_games_transaction_id = builder.source_bet365_games_transaction_id;
			this.getExternalBalanceChange = builder.getExternalBalanceChange;


		} 
	}
}
